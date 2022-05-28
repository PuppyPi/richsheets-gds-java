package rebound.richsheets.impls.helpers.gds;

import static rebound.util.collections.CollectionUtilities.*;
import java.util.Set;
import javax.annotation.Nonnull;
import rebound.exceptions.GenericDataStructuresFormatException;
import rebound.richsheets.api.model.RichsheetsTable;

public class RichsheetsGDSTranscoder
{
	public static RichsheetsTable decode(Object gds) throws GenericDataStructuresFormatException
	{
		
	}
	
	
	public static Object encode(RichsheetsTable data)
	{
		
	}
	
	
	
	
	public static Object encode(RichsheetsTable data, @Nonnull Set<Integer> columnsToAutoresize)
	{
		//Default (null) column width in GDS form is to be interpreted as "autosize" :3
		
		RichsheetsTable data2 = new RichsheetsTable(data.getRows());
		data2.setFrozenColumns(data.getFrozenColumns());
		data2.setFrozenRows(data.getFrozenRows());
		data2.setColumnWidths(mapToList(i -> columnsToAutoresize.contains(i) ? null : data.getColumnWidth(i), intervalIntegersList(0, data.getNumberOfColumns())));
		return encode(data2);
	}
}
