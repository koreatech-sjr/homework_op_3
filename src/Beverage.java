import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 * 2018년도 2학기 객체지향개발론및실습
 * 장식패턴을 사용하지 않고 커피 첨가물 추가에 따른 가격 계산
 * 실습 2
 * Beverage
 * @author 김상진
 *
 */
public abstract class Beverage{
	private String description = "Unknown Beverage";
	
	private ArrayList<Condiment> condiments = new ArrayList<>();
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		for(int i=0; i<condiments.size(); i++) {
			description += ", "+condiments.get(i).getDescription();
		}
		return description;
	}
	public void addCondiment(Condiment condiment){
		condiments.add(condiment);
	}
	public int cost(){
		int sum = 0;
		for(int i=0; i<condiments.size(); i++) {
			sum += condiments.get(i).cost();
		}
		return sum;
	}
}
