import com.eisgroup.javaexam.library.Library;
import com.eisgroup.javaexam.library.test.BaseLibraryTest;


public class Solution extends BaseLibraryTest {

	@Override
	protected Library getLibrary() {
		return new LibraryImplementation();
	}

}
