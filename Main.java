import java.util.ArrayList;
import search.MagicSearch;
import search.SearchContext;
import search.User;



class Main {
    static void pritnResult(ArrayList<SearchContext> resultFromSearch, String searchKey) {
        System.out.println("================================");
        System.out.println("Keyword : " + searchKey);
        System.out.println("================================");
        if(resultFromSearch.size() == 0) {
            System.out.println("--------------------------------");
            System.out.println("Data yang dicari tidak ditemukan");
            System.out.println("--------------------------------");
        } else {
            for(SearchContext context : resultFromSearch) {
                System.out.println("NIM          : " + context.user.nim);
                System.out.println("Name         : " + context.user.name);
                System.out.println("Address      : " + context.user.address);
                System.out.println("Search Index : " + (context.searchIndex + 1));
                System.out.println("Index        : " + (context.index + 1));
                System.out.println("--------------------------------");
            }
        }
    }



  public static void main(String[] args) {
        MagicSearch search = new MagicSearch();

        search.addSeed(new User("Andri Hariadi", "1102021", "BANDUNG"));
        search.addSeed(new User("Dewi Lestari", "1102022", "SURABAYA"));
        search.addSeed(new User("Dewi Agustin", "1102023", "MALANG"));
        search.addSeed(new User("Reni Indrayanti", "1102024", "MALANG"));
        search.addSeed(new User("Toni Sukmawan", "1102025", "SURABAYA"));
        search.addSeed(new User("Toni Gunawan", "1102026", "BANDUNG"));


        // when searching found data
        String searchKey = "Toni";
        ArrayList<SearchContext> strictSearchResult = search.strictSearch(searchKey);
        pritnResult(strictSearchResult, searchKey);

        // when searching notfound data
        String fakeSearchKey = "Rudi";
        ArrayList<SearchContext> strictSearchResultNo = search.strictSearch(fakeSearchKey);
        pritnResult(strictSearchResultNo, fakeSearchKey);
  }
}