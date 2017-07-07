package main.java.com.storedge.api.requests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vchadha on 7/6/17.
 */
public class Options {
    protected Map<String, String> options;

    public Options()
    {
        options = new HashMap<String, String>();
    }

    public void setOption(String key, String value)
    {
        options.put(key, value);
    }

    public Map<String, String> getOptions()
    {
        return options;
    }

    public void clear()
    {
        options.clear();
    }

    public boolean isEmpty()
    {
        if (options == null) return true;
        return options.isEmpty();
    }

    public void suppressResponseCodes()
    {
        setOption("suppress_response_codes", "true");
    }

    // Collections
    public void setPerPage(int perPage)
    {
        setOption("per_page", new Integer(perPage).toString());
    }

    // Collections
    public void setPageNum(int pageNum)
    {
        setOption("page", new Integer(pageNum).toString());
    }

    // Collections
    public void setSort(char order, String criteria)
    {
        setOption(order + "sort", criteria);
    }

    public void setSparseFields(String field, String criteria)
    {
        setOption(field, criteria);
    }

    // Collections
    public void setCreatedAfter(String dateTime)
    {
        setOption("created_after", dateTime);
    }

    // Collections
    public void setCreatedBefore(String dateTime)
    {
        setOption("created_before", dateTime);
    }

    // Collections
    public void setUpdatedSince(String dateTime)
    {
        setOption("updated_since", dateTime);
    }

    // Collections
    public void setIdFiltering(String[] ids)
    {
        String idList = join(",", ids);
        setOption("only_ids", idList);
    }

    public void setIncludeObjects(String[] associations)
    {
        String associationList = join(",", associations);
        setOption("include_as_object", associationList);
    }

    public void setIncludeIds(String[] associations)
    {
        String associationList = join(",", associations);
        setOption("include_as_ids", associationList);
    }

    protected String join(String delimiter, String[] collection)
    {
        StringBuilder value = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < collection.length; i++) {
            if (first)
                first = false;
            else
                value.append(delimiter);

            value.append(collection[i]);
        }

        return value.toString();
    }
}
