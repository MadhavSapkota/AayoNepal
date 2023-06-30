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
public class com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy extends com.ourdevelops.ourjek.models.CatMerchantModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface {

    static final class CatMerchantModelColumnInfo extends ColumnInfo {
        long id_kategori_merchantColKey;
        long nama_kategoriColKey;
        long foto_kategoriColKey;
        long id_fiturColKey;

        CatMerchantModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CatMerchantModel");
            this.id_kategori_merchantColKey = addColumnDetails("id_kategori_merchant", "id_kategori_merchant", objectSchemaInfo);
            this.nama_kategoriColKey = addColumnDetails("nama_kategori", "nama_kategori", objectSchemaInfo);
            this.foto_kategoriColKey = addColumnDetails("foto_kategori", "foto_kategori", objectSchemaInfo);
            this.id_fiturColKey = addColumnDetails("id_fitur", "id_fitur", objectSchemaInfo);
        }

        CatMerchantModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CatMerchantModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CatMerchantModelColumnInfo src = (CatMerchantModelColumnInfo) rawSrc;
            final CatMerchantModelColumnInfo dst = (CatMerchantModelColumnInfo) rawDst;
            dst.id_kategori_merchantColKey = src.id_kategori_merchantColKey;
            dst.nama_kategoriColKey = src.nama_kategoriColKey;
            dst.foto_kategoriColKey = src.foto_kategoriColKey;
            dst.id_fiturColKey = src.id_fiturColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CatMerchantModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.CatMerchantModel> proxyState;

    com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CatMerchantModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.CatMerchantModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_kategori_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_kategori_merchantColKey);
    }

    @Override
    public void realmSet$id_kategori_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_kategori_merchant' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama_kategori() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nama_kategoriColKey);
    }

    @Override
    public void realmSet$nama_kategori(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nama_kategoriColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nama_kategoriColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nama_kategoriColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nama_kategoriColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$foto_kategori() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.foto_kategoriColKey);
    }

    @Override
    public void realmSet$foto_kategori(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.foto_kategoriColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.foto_kategoriColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.foto_kategoriColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.foto_kategoriColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_fitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_fiturColKey);
    }

    @Override
    public void realmSet$id_fitur(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.id_fiturColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.id_fiturColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.id_fiturColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.id_fiturColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CatMerchantModel", 4, 0);
        builder.addPersistedProperty("id_kategori_merchant", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama_kategori", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("foto_kategori", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id_fitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CatMerchantModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CatMerchantModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CatMerchantModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CatMerchantModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.CatMerchantModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.CatMerchantModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
            CatMerchantModelColumnInfo columnInfo = (CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
            long pkColumnKey = columnInfo.id_kategori_merchantColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id_kategori_merchant")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id_kategori_merchant"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_kategori_merchant")) {
                if (json.isNull("id_kategori_merchant")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.CatMerchantModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.CatMerchantModel.class, json.getString("id_kategori_merchant"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_kategori_merchant'.");
            }
        }

        final com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) obj;
        if (json.has("nama_kategori")) {
            if (json.isNull("nama_kategori")) {
                objProxy.realmSet$nama_kategori(null);
            } else {
                objProxy.realmSet$nama_kategori((String) json.getString("nama_kategori"));
            }
        }
        if (json.has("foto_kategori")) {
            if (json.isNull("foto_kategori")) {
                objProxy.realmSet$foto_kategori(null);
            } else {
                objProxy.realmSet$foto_kategori((String) json.getString("foto_kategori"));
            }
        }
        if (json.has("id_fitur")) {
            if (json.isNull("id_fitur")) {
                objProxy.realmSet$id_fitur(null);
            } else {
                objProxy.realmSet$id_fitur((String) json.getString("id_fitur"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.CatMerchantModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.CatMerchantModel obj = new com.ourdevelops.ourjek.models.CatMerchantModel();
        final com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_kategori_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_kategori_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_kategori_merchant(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nama_kategori")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_kategori((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_kategori(null);
                }
            } else if (name.equals("foto_kategori")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$foto_kategori((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$foto_kategori(null);
                }
            } else if (name.equals("id_fitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_fitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_fitur(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_kategori_merchant'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.CatMerchantModel copyOrUpdate(Realm realm, CatMerchantModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatMerchantModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.CatMerchantModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.CatMerchantModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
            long pkColumnKey = columnInfo.id_kategori_merchantColKey;
            String value = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_kategori_merchant();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.CatMerchantModel copy(Realm realm, CatMerchantModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatMerchantModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.CatMerchantModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.id_kategori_merchantColKey, realmObjectSource.realmGet$id_kategori_merchant());
        builder.addString(columnInfo.nama_kategoriColKey, realmObjectSource.realmGet$nama_kategori());
        builder.addString(columnInfo.foto_kategoriColKey, realmObjectSource.realmGet$foto_kategori());
        builder.addString(columnInfo.id_fiturColKey, realmObjectSource.realmGet$id_fitur());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.CatMerchantModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long tableNativePtr = table.getNativePtr();
        CatMerchantModelColumnInfo columnInfo = (CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long pkColumnKey = columnInfo.id_kategori_merchantColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_kategori_merchant();
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
        String realmGet$nama_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$nama_kategori();
        if (realmGet$nama_kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, realmGet$nama_kategori, false);
        }
        String realmGet$foto_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$foto_kategori();
        if (realmGet$foto_kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, realmGet$foto_kategori, false);
        }
        String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_fitur();
        if (realmGet$id_fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long tableNativePtr = table.getNativePtr();
        CatMerchantModelColumnInfo columnInfo = (CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long pkColumnKey = columnInfo.id_kategori_merchantColKey;
        com.ourdevelops.ourjek.models.CatMerchantModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.CatMerchantModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_kategori_merchant();
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
            String realmGet$nama_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$nama_kategori();
            if (realmGet$nama_kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, realmGet$nama_kategori, false);
            }
            String realmGet$foto_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$foto_kategori();
            if (realmGet$foto_kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, realmGet$foto_kategori, false);
            }
            String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_fitur();
            if (realmGet$id_fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.CatMerchantModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long tableNativePtr = table.getNativePtr();
        CatMerchantModelColumnInfo columnInfo = (CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long pkColumnKey = columnInfo.id_kategori_merchantColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_kategori_merchant();
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
        String realmGet$nama_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$nama_kategori();
        if (realmGet$nama_kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, realmGet$nama_kategori, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, false);
        }
        String realmGet$foto_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$foto_kategori();
        if (realmGet$foto_kategori != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, realmGet$foto_kategori, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, false);
        }
        String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_fitur();
        if (realmGet$id_fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.id_fiturColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long tableNativePtr = table.getNativePtr();
        CatMerchantModelColumnInfo columnInfo = (CatMerchantModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        long pkColumnKey = columnInfo.id_kategori_merchantColKey;
        com.ourdevelops.ourjek.models.CatMerchantModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.CatMerchantModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_kategori_merchant();
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
            String realmGet$nama_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$nama_kategori();
            if (realmGet$nama_kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, realmGet$nama_kategori, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_kategoriColKey, colKey, false);
            }
            String realmGet$foto_kategori = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$foto_kategori();
            if (realmGet$foto_kategori != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, realmGet$foto_kategori, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.foto_kategoriColKey, colKey, false);
            }
            String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) object).realmGet$id_fitur();
            if (realmGet$id_fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.id_fiturColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.CatMerchantModel createDetachedCopy(com.ourdevelops.ourjek.models.CatMerchantModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.CatMerchantModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.CatMerchantModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.CatMerchantModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.CatMerchantModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_kategori_merchant(realmSource.realmGet$id_kategori_merchant());
        unmanagedCopy.realmSet$nama_kategori(realmSource.realmGet$nama_kategori());
        unmanagedCopy.realmSet$foto_kategori(realmSource.realmGet$foto_kategori());
        unmanagedCopy.realmSet$id_fitur(realmSource.realmGet$id_fitur());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.CatMerchantModel update(Realm realm, CatMerchantModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.CatMerchantModel realmObject, com.ourdevelops.ourjek.models.CatMerchantModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.CatMerchantModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.id_kategori_merchantColKey, realmObjectSource.realmGet$id_kategori_merchant());
        builder.addString(columnInfo.nama_kategoriColKey, realmObjectSource.realmGet$nama_kategori());
        builder.addString(columnInfo.foto_kategoriColKey, realmObjectSource.realmGet$foto_kategori());
        builder.addString(columnInfo.id_fiturColKey, realmObjectSource.realmGet$id_fitur());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CatMerchantModel = proxy[");
        stringBuilder.append("{id_kategori_merchant:");
        stringBuilder.append(realmGet$id_kategori_merchant() != null ? realmGet$id_kategori_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama_kategori:");
        stringBuilder.append(realmGet$nama_kategori() != null ? realmGet$nama_kategori() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{foto_kategori:");
        stringBuilder.append(realmGet$foto_kategori() != null ? realmGet$foto_kategori() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_fitur:");
        stringBuilder.append(realmGet$id_fitur() != null ? realmGet$id_fitur() : "null");
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
        com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy aCatMerchantModel = (com_ourdevelops_ourjek_models_CatMerchantModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCatMerchantModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCatMerchantModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCatMerchantModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
