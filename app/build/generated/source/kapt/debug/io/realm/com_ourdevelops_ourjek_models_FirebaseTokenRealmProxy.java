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
public class com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy extends com.ourdevelops.ourjek.models.FirebaseToken
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface {

    static final class FirebaseTokenColumnInfo extends ColumnInfo {
        long tokenIdColKey;

        FirebaseTokenColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FirebaseToken");
            this.tokenIdColKey = addColumnDetails("tokenId", "tokenId", objectSchemaInfo);
        }

        FirebaseTokenColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FirebaseTokenColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FirebaseTokenColumnInfo src = (FirebaseTokenColumnInfo) rawSrc;
            final FirebaseTokenColumnInfo dst = (FirebaseTokenColumnInfo) rawDst;
            dst.tokenIdColKey = src.tokenIdColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FirebaseTokenColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.FirebaseToken> proxyState;

    com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FirebaseTokenColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.FirebaseToken>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tokenId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenIdColKey);
    }

    @Override
    public void realmSet$tokenId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenIdColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("FirebaseToken", 1, 0);
        builder.addPersistedProperty("tokenId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FirebaseTokenColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FirebaseTokenColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FirebaseToken";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FirebaseToken";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.FirebaseToken createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.FirebaseToken obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.FirebaseToken.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) obj;
        if (json.has("tokenId")) {
            if (json.isNull("tokenId")) {
                objProxy.realmSet$tokenId(null);
            } else {
                objProxy.realmSet$tokenId((String) json.getString("tokenId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.FirebaseToken createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.FirebaseToken obj = new com.ourdevelops.ourjek.models.FirebaseToken();
        final com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("tokenId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tokenId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tokenId(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.FirebaseToken copyOrUpdate(Realm realm, FirebaseTokenColumnInfo columnInfo, com.ourdevelops.ourjek.models.FirebaseToken object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.FirebaseToken) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.FirebaseToken copy(Realm realm, FirebaseTokenColumnInfo columnInfo, com.ourdevelops.ourjek.models.FirebaseToken newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.FirebaseToken) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.FirebaseToken.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.tokenIdColKey, realmObjectSource.realmGet$tokenId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.FirebaseToken object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long tableNativePtr = table.getNativePtr();
        FirebaseTokenColumnInfo columnInfo = (FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$tokenId = ((com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) object).realmGet$tokenId();
        if (realmGet$tokenId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, colKey, realmGet$tokenId, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long tableNativePtr = table.getNativePtr();
        FirebaseTokenColumnInfo columnInfo = (FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class);
        com.ourdevelops.ourjek.models.FirebaseToken object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.FirebaseToken) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$tokenId = ((com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) object).realmGet$tokenId();
            if (realmGet$tokenId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, colKey, realmGet$tokenId, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.FirebaseToken object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long tableNativePtr = table.getNativePtr();
        FirebaseTokenColumnInfo columnInfo = (FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$tokenId = ((com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) object).realmGet$tokenId();
        if (realmGet$tokenId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, colKey, realmGet$tokenId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenIdColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FirebaseToken.class);
        long tableNativePtr = table.getNativePtr();
        FirebaseTokenColumnInfo columnInfo = (FirebaseTokenColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FirebaseToken.class);
        com.ourdevelops.ourjek.models.FirebaseToken object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.FirebaseToken) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$tokenId = ((com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) object).realmGet$tokenId();
            if (realmGet$tokenId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenIdColKey, colKey, realmGet$tokenId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenIdColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.FirebaseToken createDetachedCopy(com.ourdevelops.ourjek.models.FirebaseToken realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.FirebaseToken unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.FirebaseToken();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.FirebaseToken) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.FirebaseToken) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$tokenId(realmSource.realmGet$tokenId());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("FirebaseToken = proxy[");
        stringBuilder.append("{tokenId:");
        stringBuilder.append(realmGet$tokenId() != null ? realmGet$tokenId() : "null");
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
        com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy aFirebaseToken = (com_ourdevelops_ourjek_models_FirebaseTokenRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aFirebaseToken.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFirebaseToken.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aFirebaseToken.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
