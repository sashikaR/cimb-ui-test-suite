package starter.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import starter.search.CimbDeals;

import java.util.List;

@Subject("The Octo Travel Similar Deals Items")
public class SimilarDealsItems implements Question<List<String>> {
    private Object String;

    @Override
    public List<String> answeredBy(Actor actor) {
//        return Text.of(ToDoList.TODO_ITEMS).viewedBy(actor).asList();
        return null;
    }
}
