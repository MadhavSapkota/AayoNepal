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
public class com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy extends com.ourdevelops.ourjek.models.ItemPesananModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface {

    static final class ItemPesananModelColumnInfo extends ColumnInfo {
        long nama_itemColKey;
        long jumlah_itemColKey;

        ItemPesananModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ItemPesananModel");
            this.nama_itemColKey = addColumnDetails("nama_item", "nama_item", objectSchemaInfo);
            this.jumlah_itemColKey = addColumnDetails("jumlah_item", "jumlah_item", objectSchemaInfo);
        }

        ItemPesananModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ItemPesananModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ItemPesananModelColumnInfo src = (ItemPesananModelColumnInfo) rawSrc;
            final ItemPesananModelColumnInfo dst = (ItemPesananModelColumnInfo) rawDst;
            dst.nama_itemColKey = src.nama_itemColKey;
            dst.jumlah_itemColKey = src.jumlah_itemColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ItemPesananModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.ItemPesananModel> proxyState;

    com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ItemPesananModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.ItemPesananModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nama_itemColKey);
    }

    @Override
    public void realmSet$nama_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nama_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nama_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nama_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nama_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jumlah_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jumlah_itemColKey);
    }

    @Override
    public void realmSet$jumlah_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jumlah_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.jumlah_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jumlah_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jumlah_itemColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ItemPesananModel", 2, 0);
        builder.addPersistedProperty("nama_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jumlah_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ItemPesananModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ItemPesananModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ItemPesananModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ItemPesananModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.ItemPesananModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.ItemPesananModel obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.ItemPesananModel.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) obj;
        if (json.has("nama_item")) {
            if (json.isNull("nama_item")) {
                objProxy.realmSet$nama_item(null);
            } else {
                objProxy.realmSet$nama_item((String) json.getString("nama_item"));
            }
        }
        if (json.has("jumlah_item")) {
            if (json.isNull("jumlah_item")) {
                objProxy.realmSet$jumlah_item(null);
            } else {
                objProxy.realmSet$jumlah_item((String) json.getString("jumlah_item"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.ItemPesananModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.ItemPesananModel obj = new com.ourdevelops.ourjek.models.ItemPesananModel();
        final com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("nama_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_item(null);
                }
            } else if (name.equals("jumlah_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jumlah_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jumlah_item(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.ItemPesananModel copyOrUpdate(Realm realm, ItemPesananModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.ItemPesananModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.ItemPesananModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.ItemPesananModel copy(Realm realm, ItemPesananModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.ItemPesananModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.ItemPesananModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nama_itemColKey, realmObjectSource.realmGet$nama_item());
        builder.addString(columnInfo.jumlah_itemColKey, realmObjectSource.realmGet$jumlah_item());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.ItemPesananModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemPesananModelColumnInfo columnInfo = (ItemPesananModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$nama_item();
        if (realmGet$nama_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
        }
        String realmGet$jumlah_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$jumlah_item();
        if (realmGet$jumlah_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, realmGet$jumlah_item, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemPesananModelColumnInfo columnInfo = (ItemPesananModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        com.ourdevelops.ourjek.models.ItemPesananModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.ItemPesananModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$nama_item();
            if (realmGet$nama_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
            }
            String realmGet$jumlah_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$jumlah_item();
            if (realmGet$jumlah_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, realmGet$jumlah_item, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.ItemPesananModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemPesananModelColumnInfo columnInfo = (ItemPesananModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$nama_item();
        if (realmGet$nama_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_itemColKey, colKey, false);
        }
        String realmGet$jumlah_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$jumlah_item();
        if (realmGet$jumlah_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, realmGet$jumlah_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemPesananModelColumnInfo columnInfo = (ItemPesananModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemPesananModel.class);
        com.ourdevelops.ourjek.models.ItemPesananModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.ItemPesananModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$nama_item();
            if (realmGet$nama_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_itemColKey, colKey, false);
            }
            String realmGet$jumlah_item = ((com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) object).realmGet$jumlah_item();
            if (realmGet$jumlah_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, realmGet$jumlah_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jumlah_itemColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.ItemPesananModel createDetachedCopy(com.ourdevelops.ourjek.models.ItemPesananModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.ItemPesananModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.ItemPesananModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.ItemPesananModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.ItemPesananModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$nama_item(realmSource.realmGet$nama_item());
        unmanagedCopy.realmSet$jumlah_item(realmSource.realmGet$jumlah_item());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ItemPesananModel = proxy[");
        stringBuilder.append("{nama_item:");
        stringBuilder.append(realmGet$nama_item() != null ? realmGet$nama_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jumlah_item:");
        stringBuilder.append(realmGet$jumlah_item() != null ? realmGet$jumlah_item() : "null");
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
        com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy aItemPesananModel = (com_ourdevelops_ourjek_models_ItemPesananModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aItemPesananModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aItemPesananModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aItemPesananModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
