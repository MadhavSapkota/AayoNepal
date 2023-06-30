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
public class com_ourdevelops_ourjek_models_BankModelRealmProxy extends com.ourdevelops.ourjek.models.BankModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_BankModelRealmProxyInterface {

    static final class BankModelColumnInfo extends ColumnInfo {
        long id_bankColKey;
        long nama_bankColKey;
        long image_bankColKey;
        long rekening_bankColKey;

        BankModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BankModel");
            this.id_bankColKey = addColumnDetails("id_bank", "id_bank", objectSchemaInfo);
            this.nama_bankColKey = addColumnDetails("nama_bank", "nama_bank", objectSchemaInfo);
            this.image_bankColKey = addColumnDetails("image_bank", "image_bank", objectSchemaInfo);
            this.rekening_bankColKey = addColumnDetails("rekening_bank", "rekening_bank", objectSchemaInfo);
        }

        BankModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BankModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BankModelColumnInfo src = (BankModelColumnInfo) rawSrc;
            final BankModelColumnInfo dst = (BankModelColumnInfo) rawDst;
            dst.id_bankColKey = src.id_bankColKey;
            dst.nama_bankColKey = src.nama_bankColKey;
            dst.image_bankColKey = src.image_bankColKey;
            dst.rekening_bankColKey = src.rekening_bankColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BankModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.BankModel> proxyState;

    com_ourdevelops_ourjek_models_BankModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BankModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.BankModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_bank() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_bankColKey);
    }

    @Override
    public void realmSet$id_bank(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_bank' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama_bank() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nama_bankColKey);
    }

    @Override
    public void realmSet$nama_bank(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nama_bankColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nama_bankColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nama_bankColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nama_bankColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$image_bank() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.image_bankColKey);
    }

    @Override
    public void realmSet$image_bank(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.image_bankColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.image_bankColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.image_bankColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.image_bankColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rekening_bank() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.rekening_bankColKey);
    }

    @Override
    public void realmSet$rekening_bank(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.rekening_bankColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.rekening_bankColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.rekening_bankColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.rekening_bankColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BankModel", 4, 0);
        builder.addPersistedProperty("id_bank", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama_bank", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("image_bank", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rekening_bank", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BankModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BankModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BankModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BankModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.BankModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.BankModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
            BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
            long pkColumnKey = columnInfo.id_bankColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id_bank")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id_bank"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_bank")) {
                if (json.isNull("id_bank")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.BankModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.BankModel.class, json.getString("id_bank"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_bank'.");
            }
        }

        final com_ourdevelops_ourjek_models_BankModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) obj;
        if (json.has("nama_bank")) {
            if (json.isNull("nama_bank")) {
                objProxy.realmSet$nama_bank(null);
            } else {
                objProxy.realmSet$nama_bank((String) json.getString("nama_bank"));
            }
        }
        if (json.has("image_bank")) {
            if (json.isNull("image_bank")) {
                objProxy.realmSet$image_bank(null);
            } else {
                objProxy.realmSet$image_bank((String) json.getString("image_bank"));
            }
        }
        if (json.has("rekening_bank")) {
            if (json.isNull("rekening_bank")) {
                objProxy.realmSet$rekening_bank(null);
            } else {
                objProxy.realmSet$rekening_bank((String) json.getString("rekening_bank"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.BankModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.BankModel obj = new com.ourdevelops.ourjek.models.BankModel();
        final com_ourdevelops_ourjek_models_BankModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_bank")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_bank((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_bank(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nama_bank")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_bank((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_bank(null);
                }
            } else if (name.equals("image_bank")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$image_bank((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$image_bank(null);
                }
            } else if (name.equals("rekening_bank")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rekening_bank((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rekening_bank(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_bank'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_BankModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.BankModel copyOrUpdate(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BankModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.BankModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.BankModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
            long pkColumnKey = columnInfo.id_bankColKey;
            String value = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$id_bank();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.BankModel copy(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BankModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.BankModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_BankModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.id_bankColKey, realmObjectSource.realmGet$id_bank());
        builder.addString(columnInfo.nama_bankColKey, realmObjectSource.realmGet$nama_bank());
        builder.addString(columnInfo.image_bankColKey, realmObjectSource.realmGet$image_bank());
        builder.addString(columnInfo.rekening_bankColKey, realmObjectSource.realmGet$rekening_bank());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_BankModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.BankModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
        long pkColumnKey = columnInfo.id_bankColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$id_bank();
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
        String realmGet$nama_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$nama_bank();
        if (realmGet$nama_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_bankColKey, colKey, realmGet$nama_bank, false);
        }
        String realmGet$image_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$image_bank();
        if (realmGet$image_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.image_bankColKey, colKey, realmGet$image_bank, false);
        }
        String realmGet$rekening_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$rekening_bank();
        if (realmGet$rekening_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rekening_bankColKey, colKey, realmGet$rekening_bank, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
        long pkColumnKey = columnInfo.id_bankColKey;
        com.ourdevelops.ourjek.models.BankModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.BankModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$id_bank();
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
            String realmGet$nama_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$nama_bank();
            if (realmGet$nama_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_bankColKey, colKey, realmGet$nama_bank, false);
            }
            String realmGet$image_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$image_bank();
            if (realmGet$image_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.image_bankColKey, colKey, realmGet$image_bank, false);
            }
            String realmGet$rekening_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$rekening_bank();
            if (realmGet$rekening_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rekening_bankColKey, colKey, realmGet$rekening_bank, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.BankModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
        long pkColumnKey = columnInfo.id_bankColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$id_bank();
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
        String realmGet$nama_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$nama_bank();
        if (realmGet$nama_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_bankColKey, colKey, realmGet$nama_bank, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_bankColKey, colKey, false);
        }
        String realmGet$image_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$image_bank();
        if (realmGet$image_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.image_bankColKey, colKey, realmGet$image_bank, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.image_bankColKey, colKey, false);
        }
        String realmGet$rekening_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$rekening_bank();
        if (realmGet$rekening_bank != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rekening_bankColKey, colKey, realmGet$rekening_bank, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rekening_bankColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        long tableNativePtr = table.getNativePtr();
        BankModelColumnInfo columnInfo = (BankModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.BankModel.class);
        long pkColumnKey = columnInfo.id_bankColKey;
        com.ourdevelops.ourjek.models.BankModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.BankModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$id_bank();
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
            String realmGet$nama_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$nama_bank();
            if (realmGet$nama_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_bankColKey, colKey, realmGet$nama_bank, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_bankColKey, colKey, false);
            }
            String realmGet$image_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$image_bank();
            if (realmGet$image_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.image_bankColKey, colKey, realmGet$image_bank, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.image_bankColKey, colKey, false);
            }
            String realmGet$rekening_bank = ((com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) object).realmGet$rekening_bank();
            if (realmGet$rekening_bank != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rekening_bankColKey, colKey, realmGet$rekening_bank, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rekening_bankColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.BankModel createDetachedCopy(com.ourdevelops.ourjek.models.BankModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.BankModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.BankModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.BankModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.BankModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_BankModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_BankModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_bank(realmSource.realmGet$id_bank());
        unmanagedCopy.realmSet$nama_bank(realmSource.realmGet$nama_bank());
        unmanagedCopy.realmSet$image_bank(realmSource.realmGet$image_bank());
        unmanagedCopy.realmSet$rekening_bank(realmSource.realmGet$rekening_bank());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.BankModel update(Realm realm, BankModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.BankModel realmObject, com.ourdevelops.ourjek.models.BankModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_BankModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_BankModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_BankModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.BankModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.id_bankColKey, realmObjectSource.realmGet$id_bank());
        builder.addString(columnInfo.nama_bankColKey, realmObjectSource.realmGet$nama_bank());
        builder.addString(columnInfo.image_bankColKey, realmObjectSource.realmGet$image_bank());
        builder.addString(columnInfo.rekening_bankColKey, realmObjectSource.realmGet$rekening_bank());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BankModel = proxy[");
        stringBuilder.append("{id_bank:");
        stringBuilder.append(realmGet$id_bank() != null ? realmGet$id_bank() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama_bank:");
        stringBuilder.append(realmGet$nama_bank() != null ? realmGet$nama_bank() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{image_bank:");
        stringBuilder.append(realmGet$image_bank() != null ? realmGet$image_bank() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rekening_bank:");
        stringBuilder.append(realmGet$rekening_bank() != null ? realmGet$rekening_bank() : "null");
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
        com_ourdevelops_ourjek_models_BankModelRealmProxy aBankModel = (com_ourdevelops_ourjek_models_BankModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aBankModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBankModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aBankModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
