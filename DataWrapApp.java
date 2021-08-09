
public class DataWrapApp {

	public static void main(String[] args) {
		
		System.out.println(DataWrapper.wrapSquare("array"));
		
		System.out.println(DataWrapper.wrapAngle("tag"));
		
		System.out.println(DataWrapper.wrapRound("0.5"));

	}

}
// secondary class
class DataWrapper {
	
	// wrapRound
	static String wrapRound( String text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( int text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( double text ) {
		  return "(" + text + ")";
		}
	static String wrapRound( char text ) {
		  return "(" + text + ")";}
		  
	// wrapSquare
    static String wrapSquare( String text ) {
			  return "[" + text + "]";
			}
	static String wrapSquare( int text ) {
			  return "[" + text + "]";
			}
	static String wrapSquare( double text ) {
			  return "[" + text + "]";
			}
	static String wrapSquare( char text ) {
			  return "[" + text + "]";	}
			  
	//wrapAngle
	static String wrapAngle( String text ) {
				  return "<" + text + ">";
				}
	static String wrapAngle( int text ) {
				  return "<" + text + ">";
				}
	static String wrapAngle( double text ) {
				  return "<" + text + ">";
				}
	static String wrapAngle( char text ) {
				  return "<" + text + ">";			  
			  
		  
		}

}
