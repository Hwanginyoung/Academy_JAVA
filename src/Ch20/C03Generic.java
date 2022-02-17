//package Ch20;
//
//class Powder {
//	public void doPrinting() {
//		System.out.println("파우더 재료로 출력!")
//	}
//}
//class Plastic {
//	public void doPrinting() {
//		System.out.println("플라스틱 재료로 출력!")
//	}
//}
//
//class ThreeDPrinter {
//	private Object material;
//	
//	public Object getMaterial() {
//		return material;
//	}
//	public void setMaterial(Object material) {
//		this.material = material;
//	}
//	public void ShowMaterial() {
//		//다운캐스팅한 뒤 doPrinting() 사용하기
//		if(material instanceof Powder) {
//			Powder down = (Powder)material;
//			down.doPrinting();
//		}
//		else if(material instanceof Plastic) {
//			Plastic down = (Plastic)material;
//			down.doPrinting();
//		}
//	}
//}
//
//public class C03Generic {
//
//	public static void main(String[] args) {
//
//		ThreeDPrinter printer1 = new ThreeDPrinter();
//		printer1.setMaterial(new Powder());
//		//Powder down = (Powder)printer1.getMaterial(); //나오는 리턴형은 Object형 Downcasting해야됨
//		//down.doPrinting();
//		printer1.ShowMaterial();
//		
//		ThreeDPrinter printer2 = new ThreeDPrinter();
//		printer2.setMaterial(new Plastic());
//		printer2.ShowMaterial();
//		
//	}
//
//}
