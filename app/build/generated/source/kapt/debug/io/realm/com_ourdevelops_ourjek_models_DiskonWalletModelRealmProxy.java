package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy extends com.ourdevelops.ourjek.models.DiskonWalletModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface {

    static final class DiskonWalletModelColumnInfo extends ColumnInfo {
        long diskonColKey;
        long biayaAkhirColKey;

        DiskonWalletModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("DiskonWalletModel");
            this.diskonColKey = addColumnDetails("diskon", "diskon", objectSchemaInfo);
            this.biayaAkhirColKey = addColumnDetails("biayaAkhir", "biayaAkhir", objectSchemaInfo);
        }

        DiskonWalletModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DiskonWalletModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DiskonWalletModelColumnInfo src = (DiskonWalletModelColumnInfo) rawSrc;
            final DiskonWalletModelColumnInfo dst = (DiskonWalletModelColumnInfo) rawDst;
            dst.diskonColKey = src.diskonColKey;
            dst.biayaAkhirColKey = src.biayaAkhirColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DiskonWalletModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.DiskonWalletModel> proxyState;

    com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DiskonWalletModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.DiskonWalletModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$diskon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.diskonColKey);
    }

    @Override
    public void realmSet$diskon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.diskonColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.diskonColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.diskonColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.diskonColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$biayaAkhir() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.biayaAkhirColKey)) {
            return null;
        }
        return (double) proxyState.getRow$realm().getDouble(columnInfo.biayaAkhirColKey);
    }

    @Override
    public void realmSet$biayaAkhir(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.biayaAkhirColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDouble(columnInfo.biayaAkhirColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.biayaAkhirColKey);
            return;
        }
        proxyState.getRow$realm().setDouble(columnInfo.biayaAkhirColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("DiskonWalletModel", 2, 0);
        builder.addPersistedProperty("diskon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("biayaAkhir", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DiskonWalletModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DiskonWalletModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "DiskonWalletModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DiskonWalletModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.DiskonWalletModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.DiskonWalletModel obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.DiskonWalletModel.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) obj;
        if (json.has("diskon")) {
            if (json.isNull("diskon")) {
                objProxy.realmSet$diskon(null);
            } else {
                objProxy.realmSet$diskon((String) json.getString("diskon"));
            }
        }
        if (json.has("biayaAkhir")) {
            if (json.isNull("biayaAkhir")) {
                objProxy.realmSet$biayaAkhir(null);
            } else {
                objProxy.realmSet$biayaAkhir((double) json.getDouble("biayaAkhir"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.DiskonWalletModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.DiskonWalletModel obj = new com.ourdevelops.ourjek.models.DiskonWalletModel();
        final com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("diskon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$diskon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$diskon(null);
                }
            } else if (name.equals("biayaAkhir")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biayaAkhir((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$biayaAkhir(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.DiskonWalletModel copyOrUpdate(Realm realm, DiskonWalletModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.DiskonWalletModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.DiskonWalletModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.DiskonWalletModel copy(Realm realm, DiskonWalletModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.DiskonWalletModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.DiskonWalletModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.diskonColKey, realmObjectSource.realmGet$diskon());
        builder.addDouble(columnInfo.biayaAkhirColKey, realmObjectSource.realmGet$biayaAkhir());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.DiskonWalletModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long tableNativePtr = table.getNativePtr();
        DiskonWalletModelColumnInfo columnInfo = (DiskonWalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$diskon = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$diskon();
        if (realmGet$diskon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
        }
        Double realmGet$biayaAkhir = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$biayaAkhir();
        if (realmGet$biayaAkhir != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, realmGet$biayaAkhir, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long tableNativePtr = table.getNativePtr();
        DiskonWalletModelColumnInfo columnInfo = (DiskonWalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        com.ourdevelops.ourjek.models.DiskonWalletModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.DiskonWalletModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$diskon = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$diskon();
            if (realmGet$diskon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
            }
            Double realmGet$biayaAkhir = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$biayaAkhir();
            if (realmGet$biayaAkhir != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, realmGet$biayaAkhir, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.DiskonWalletModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long tableNativePtr = table.getNativePtr();
        DiskonWalletModelColumnInfo columnInfo = (DiskonWalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$diskon = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$diskon();
        if (realmGet$diskon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.diskonColKey, colKey, false);
        }
        Double realmGet$biayaAkhir = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$biayaAkhir();
        if (realmGet$biayaAkhir != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, realmGet$biayaAkhir, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        long tableNativePtr = table.getNativePtr();
        DiskonWalletModelColumnInfo columnInfo = (DiskonWalletModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DiskonWalletModel.class);
        com.ourdevelops.ourjek.models.DiskonWalletModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.DiskonWalletModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$diskon = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$diskon();
            if (realmGet$diskon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.diskonColKey, colKey, false);
            }
            Double realmGet$biayaAkhir = ((com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) object).realmGet$biayaAkhir();
            if (realmGet$biayaAkhir != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, realmGet$biayaAkhir, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.DiskonWalletModel createDetachedCopy(com.ourdevelops.ourjek.models.DiskonWalletModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.DiskonWalletModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.DiskonWalletModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.DiskonWalletModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.DiskonWalletModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$diskon(realmSource.realmGet$diskon());
        unmanagedCopy.realmSet$biayaAkhir(realmSource.realmGet$biayaAkhir());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("DiskonWalletModel = proxy[");
        stringBuilder.append("{diskon:");
        stringBuilder.append(realmGet$diskon() != null ? realmGet$diskon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{biayaAkhir:");
        stringBuilder.append(realmGet$biayaAkhir() != null ? realmGet$biayaAkhir() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long colKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (colKey ^ (colKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy aDiskonWalletModel = (com_ourdevelops_ourjek_models_DiskonWalletModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aDiskonWalletModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDiskonWalletModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aDiskonWalletModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
