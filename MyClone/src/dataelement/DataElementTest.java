package dataelement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataElementTest {
	public static void main(String[] args) {

		List<DataElement> list = new ArrayList<>();
		DataElement dataElement1 = new DataElement("1", "低层需求1", 1);
		list.add(dataElement1);
		DataElement dataElement2 = new DataElement("2", "低层需求2", 1);
		list.add(dataElement2);
		DataElement dataElement3 = new DataElement("3", "低层需求3", 1);
		list.add(dataElement3);
		DataElement dataElement4 = new DataElement("4", "低层需求4", 2);
		list.add(dataElement4);
		DataElement dataElement5 = new DataElement("5", "低层需求5", 3);
		list.add(dataElement5);
		DataElement dataElement6 = new DataElement("6", "低层需求6", 3);
		list.add(dataElement6);

		List<List<DataElement>> group = getDataElementGroup(list);

		for (List<DataElement> list2 : group) {
			for (DataElement dataElement : list2) {
				System.out.print(dataElement.getName() + "\t");
			}
			System.out.println();
		}

	}

	private static List<List<DataElement>> getDataElementGroup(
			List<DataElement> list) {
		List<List<DataElement>> group = new ArrayList<>();

		Map<Integer, List<DataElement>> map = new HashMap<>();

		for (DataElement dataElement : list) {
			if (map.keySet().contains(dataElement.getConfigId())) {
				map.get(dataElement.getConfigId()).add(dataElement);
			} else {
				List<DataElement> dataElements = new ArrayList<>();
				dataElements.add(dataElement);
				map.put(dataElement.getConfigId(), dataElements);
			}
		}
		int maxSize = 0;
		for (Map.Entry<Integer, List<DataElement>> entry : map.entrySet()) {
			maxSize = Math.max(maxSize, entry.getValue().size());
		}
		for (int i = 0; i < maxSize; i++) {
			List<DataElement> row = new ArrayList<>();
			for (Map.Entry<Integer, List<DataElement>> entry : map.entrySet()) {
				if (entry.getValue().size() > i) {
					row.add(entry.getValue().get(i));
				}
				// if (entry.getValue().get(i) != null) {
				// row.add(entry.getValue().get(i));
				// }
			}
			group.add(row);
		}

		return group;
	}

}
