package cm.gov.minfof.model.entityviewobject;

import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class VueImplementation extends ViewObjectImpl {
    public VueImplementation(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
    }

    public VueImplementation() {
        super();
    }
    
    @Override
    protected String buildQuery(int noUserParams, boolean forRowCount)
    {
        String query = super.buildQuery(noUserParams, forRowCount);
        if (query!=null) {
            query = query.replace( "LIKE UPPER( ? || '%')", "LIKE UPPER(CONCAT( ?, '%' ))");
            query = query.replace("LIKE ( ? || '%')", "LIKE CONCAT(?, '%')");
        }
        return query;
    }

    @Override
    protected String buildQuery(int noUserParams, boolean forRowCount, String selClause, String fromClause, String whereClause, int subQueryLevel)
    {
        String query = super.buildQuery(noUserParams, forRowCount, selClause, fromClause, whereClause, subQueryLevel);
        if (query!=null) {
          query = query.replace( "LIKE UPPER( ? || '%')", "LIKE UPPER(CONCAT( ?, '%' ))");
          query = query.replace("LIKE ( ? || '%')", "LIKE CONCAT(?, '%')");
        }
        return query;
      }
}
