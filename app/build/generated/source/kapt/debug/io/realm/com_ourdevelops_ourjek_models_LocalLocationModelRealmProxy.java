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
public class com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy extends com.ourdevelops.ourjek.models.LocalLocationModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface {

    static final class LocalLocationModelColumnInfo extends ColumnInfo {
        long nameColKey;
        long latitudeColKey;
        long longitudeColKey;

        LocalLocationModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LocalLocationModel");
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.latitudeColKey = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeColKey = addColumnDetails("longitude", "longitude", objectSchemaInfo);
        }

        LocalLocationModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LocalLocationModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LocalLocationModelColumnInfo src = (LocalLocationModelColumnInfo) rawSrc;
            final LocalLocationModelColumnInfo dst = (LocalLocationModelColumnInfo) rawDst;
            dst.nameColKey = src.nameColKey;
            dst.latitudeColKey = src.latitudeColKey;
            dst.longitudeColKey = src.longitudeColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LocalLocationModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.LocalLocationModel> proxyState;

    com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LocalLocationModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.LocalLocationModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$latitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.latitudeColKey);
    }

    @Override
    public void realmSet$latitude(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latitudeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.latitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latitudeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.latitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$longitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.longitudeColKey);
    }

    @Override
    public void realmSet$longitude(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.longitudeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.longitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.longitudeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.longitudeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LocalLocationModel", 3, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("longitude", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LocalLocationModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LocalLocationModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LocalLocationModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LocalLocationModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.LocalLocationModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.LocalLocationModel obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.LocalLocationModel.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("latitude")) {
            if (json.isNull("latitude")) {
                objProxy.realmSet$latitude(null);
            } else {
                objProxy.realmSet$latitude((String) json.getString("latitude"));
            }
        }
        if (json.has("longitude")) {
            if (json.isNull("longitude")) {
                objProxy.realmSet$longitude(null);
            } else {
                objProxy.realmSet$longitude((String) json.getString("longitude"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.LocalLocationModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.LocalLocationModel obj = new com.ourdevelops.ourjek.models.LocalLocationModel();
        final com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("latitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latitude((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$latitude(null);
                }
            } else if (name.equals("longitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$longitude((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$longitude(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.LocalLocationModel copyOrUpdate(Realm realm, LocalLocationModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.LocalLocationModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.LocalLocationModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.LocalLocationModel copy(Realm realm, LocalLocationModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.LocalLocationModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.LocalLocationModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.latitudeColKey, realmObjectSource.realmGet$latitude());
        builder.addString(columnInfo.longitudeColKey, realmObjectSource.realmGet$longitude());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.LocalLocationModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long tableNativePtr = table.getNativePtr();
        LocalLocationModelColumnInfo columnInfo = (LocalLocationModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$name = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        }
        String realmGet$latitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latitudeColKey, colKey, realmGet$latitude, false);
        }
        String realmGet$longitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$longitude();
        if (realmGet$longitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.longitudeColKey, colKey, realmGet$longitude, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long tableNativePtr = table.getNativePtr();
        LocalLocationModelColumnInfo columnInfo = (LocalLocationModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        com.ourdevelops.ourjek.models.LocalLocationModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.LocalLocationModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$name = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            }
            String realmGet$latitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$latitude();
            if (realmGet$latitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latitudeColKey, colKey, realmGet$latitude, false);
            }
            String realmGet$longitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$longitude();
            if (realmGet$longitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.longitudeColKey, colKey, realmGet$longitude, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.LocalLocationModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long tableNativePtr = table.getNativePtr();
        LocalLocationModelColumnInfo columnInfo = (LocalLocationModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$name = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
        }
        String realmGet$latitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latitudeColKey, colKey, realmGet$latitude, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latitudeColKey, colKey, false);
        }
        String realmGet$longitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$longitude();
        if (realmGet$longitude != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.longitudeColKey, colKey, realmGet$longitude, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.longitudeColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        long tableNativePtr = table.getNativePtr();
        LocalLocationModelColumnInfo columnInfo = (LocalLocationModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.LocalLocationModel.class);
        com.ourdevelops.ourjek.models.LocalLocationModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.LocalLocationModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$name = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, colKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, colKey, false);
            }
            String realmGet$latitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$latitude();
            if (realmGet$latitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latitudeColKey, colKey, realmGet$latitude, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latitudeColKey, colKey, false);
            }
            String realmGet$longitude = ((com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) object).realmGet$longitude();
            if (realmGet$longitude != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.longitudeColKey, colKey, realmGet$longitude, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.longitudeColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.LocalLocationModel createDetachedCopy(com.ourdevelops.ourjek.models.LocalLocationModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.LocalLocationModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.LocalLocationModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.LocalLocationModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.LocalLocationModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LocalLocationModel = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latitude:");
        stringBuilder.append(realmGet$latitude() != null ? realmGet$latitude() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{longitude:");
        stringBuilder.append(realmGet$longitude() != null ? realmGet$longitude() : "null");
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
        com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy aLocalLocationModel = (com_ourdevelops_ourjek_models_LocalLocationModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aLocalLocationModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLocalLocationModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aLocalLocationModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
