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
public class com_ourdevelops_ourjek_models_CatItemModelRealmProxy extends com.ourdevelops.ourjek.models.CatItemModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface {

    static final class CatItemModelColumnInfo extends ColumnInfo {
        long nama_kategori_itemColKey;
        long id_kategori_itemColKey;

        CatItemModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CatItemModel");
            this.nama_kategori_itemColKey = addColumnDetails("nama_kategori_item", "nama_kategori_item", objectSchemaInfo);
            this.id_kategori_itemColKey = addColumnDetails("id_kategori_item", "id_kategori_item", objectSchemaInfo);
        }

        CatItemModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CatItemModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CatItemModelColumnInfo src = (CatItemModelColumnInfo) rawSrc;
            final CatItemModelColumnInfo dst = (CatItemModelColumnInfo) rawDst;
            dst.nama_kategori_itemColKey = src.nama_kategori_itemColKey;
            dst.id_kategori_itemColKey = src.id_kategori_itemColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CatItemModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.CatItemModel> proxyState;

    com_ourdevelops_ourjek_models_CatItemModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CatItemModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.CatItemModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama_kategori_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nama_kategori_itemColKey);
    }

    @Override
    public void realmSet$nama_kategori_item(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'nama_kategori_item' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_kategori_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_kategori_itemColKey);
    }

    @Override
    public void realmSet$id_kategori_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.id_kategori_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.id_kategori_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.id_kategori_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.id_kategori_itemColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CatItemModel", 2, 0);
        builder.addPersistedProperty("nama_kategori_item", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id_kategori_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CatItemModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CatItemModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CatItemModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CatItemModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.CatItemModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.CatItemModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
            CatItemModelColumnInfo columnInfo = (CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
            long pkColumnKey = columnInfo.nama_kategori_itemColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("nama_kategori_item")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("nama_kategori_item"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("nama_kategori_item")) {
                if (json.isNull("nama_kategori_item")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.CatItemModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.CatItemModel.class, json.getString("nama_kategori_item"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nama_kategori_item'.");
            }
        }

        final com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) obj;
        if (json.has("id_kategori_item")) {
            if (json.isNull("id_kategori_item")) {
                objProxy.realmSet$id_kategori_item(null);
            } else {
                objProxy.realmSet$id_kategori_item((String) json.getString("id_kategori_item"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.CatItemModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.CatItemModel obj = new com.ourdevelops.ourjek.models.CatItemModel();
        final com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("nama_kategori_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_kategori_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_kategori_item(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("id_kategori_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_kategori_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_kategori_item(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'nama_kategori_item'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_CatItemModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.CatItemModel copyOrUpdate(Realm realm, CatItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatItemModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.CatItemModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.CatItemModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
            long pkColumnKey = columnInfo.nama_kategori_itemColKey;
            String value = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$nama_kategori_item();
            long colKey = Table.NO_MATCH;
            if (value == null) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, value);
            }
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.CatItemModel copy(Realm realm, CatItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatItemModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.CatItemModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nama_kategori_itemColKey, realmObjectSource.realmGet$nama_kategori_item());
        builder.addString(columnInfo.id_kategori_itemColKey, realmObjectSource.realmGet$id_kategori_item());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_CatItemModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.CatItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CatItemModelColumnInfo columnInfo = (CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
        long pkColumnKey = columnInfo.nama_kategori_itemColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$nama_kategori_item();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$id_kategori_item = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$id_kategori_item();
        if (realmGet$id_kategori_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, realmGet$id_kategori_item, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CatItemModelColumnInfo columnInfo = (CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
        long pkColumnKey = columnInfo.nama_kategori_itemColKey;
        com.ourdevelops.ourjek.models.CatItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.CatItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$nama_kategori_item();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$id_kategori_item = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$id_kategori_item();
            if (realmGet$id_kategori_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, realmGet$id_kategori_item, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.CatItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CatItemModelColumnInfo columnInfo = (CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
        long pkColumnKey = columnInfo.nama_kategori_itemColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$nama_kategori_item();
        long colKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$id_kategori_item = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$id_kategori_item();
        if (realmGet$id_kategori_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, realmGet$id_kategori_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        long tableNativePtr = table.getNativePtr();
        CatItemModelColumnInfo columnInfo = (CatItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatItemModel.class);
        long pkColumnKey = columnInfo.nama_kategori_itemColKey;
        com.ourdevelops.ourjek.models.CatItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.CatItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$nama_kategori_item();
            long colKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                colKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                colKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$id_kategori_item = ((com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) object).realmGet$id_kategori_item();
            if (realmGet$id_kategori_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, realmGet$id_kategori_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.id_kategori_itemColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.CatItemModel createDetachedCopy(com.ourdevelops.ourjek.models.CatItemModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.CatItemModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.CatItemModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.CatItemModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.CatItemModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$nama_kategori_item(realmSource.realmGet$nama_kategori_item());
        unmanagedCopy.realmSet$id_kategori_item(realmSource.realmGet$id_kategori_item());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.CatItemModel update(Realm realm, CatItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatItemModel realmObject, com.ourdevelops.ourjek.models.CatItemModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_CatItemModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.nama_kategori_itemColKey, realmObjectSource.realmGet$nama_kategori_item());
        builder.addString(columnInfo.id_kategori_itemColKey, realmObjectSource.realmGet$id_kategori_item());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CatItemModel = proxy[");
        stringBuilder.append("{nama_kategori_item:");
        stringBuilder.append(realmGet$nama_kategori_item() != null ? realmGet$nama_kategori_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_kategori_item:");
        stringBuilder.append(realmGet$id_kategori_item() != null ? realmGet$id_kategori_item() : "null");
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
        com_ourdevelops_ourjek_models_CatItemModelRealmProxy aCatItemModel = (com_ourdevelops_ourjek_models_CatItemModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCatItemModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCatItemModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCatItemModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
