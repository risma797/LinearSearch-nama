package search;

import java.util.ArrayList;
import search.SearchContext;
import search.User;

public class MagicSearch {
    public ArrayList<User> userToSearch = new ArrayList<>();

    public void addSeed(User user) {
        this.userToSearch.add(user);
    }

    public ArrayList<SearchContext> strictSearch(String name) {
        ArrayList<SearchContext> result = new ArrayList<>();
        for(int i  = 0; i < this.userToSearch.size(); i++) {
            User currentUser = this.userToSearch.get(i);
            if(currentUser.name.indexOf(name) >= 0) {
                result.add(new SearchContext(currentUser, i, currentUser.name.indexOf(name)));
            }
        }
        return result;
    }
}