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
public class com_ourdevelops_ourjek_models_PesananMerchantRealmProxy extends com.ourdevelops.ourjek.models.PesananMerchant
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface {

    static final class PesananMerchantColumnInfo extends ColumnInfo {
        long idItemColKey;
        long totalHargaColKey;
        long qtyColKey;
        long restaurant_idColKey;
        long catatanColKey;

        PesananMerchantColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PesananMerchant");
            this.idItemColKey = addColumnDetails("idItem", "idItem", objectSchemaInfo);
            this.totalHargaColKey = addColumnDetails("totalHarga", "totalHarga", objectSchemaInfo);
            this.qtyColKey = addColumnDetails("qty", "qty", objectSchemaInfo);
            this.restaurant_idColKey = addColumnDetails("restaurant_id", "restaurant_id", objectSchemaInfo);
            this.catatanColKey = addColumnDetails("catatan", "catatan", objectSchemaInfo);
        }

        PesananMerchantColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PesananMerchantColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PesananMerchantColumnInfo src = (PesananMerchantColumnInfo) rawSrc;
            final PesananMerchantColumnInfo dst = (PesananMerchantColumnInfo) rawDst;
            dst.idItemColKey = src.idItemColKey;
            dst.totalHargaColKey = src.totalHargaColKey;
            dst.qtyColKey = src.qtyColKey;
            dst.restaurant_idColKey = src.restaurant_idColKey;
            dst.catatanColKey = src.catatanColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PesananMerchantColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.PesananMerchant> proxyState;

    com_ourdevelops_ourjek_models_PesananMerchantRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PesananMerchantColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.PesananMerchant>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idItem() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idItemColKey);
    }

    @Override
    public void realmSet$idItem(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'idItem' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$totalHarga() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.totalHargaColKey);
    }

    @Override
    public void realmSet$totalHarga(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.totalHargaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.totalHargaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$qty() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.qtyColKey);
    }

    @Override
    public void realmSet$qty(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.qtyColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.qtyColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$restaurant_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.restaurant_idColKey);
    }

    @Override
    public void realmSet$restaurant_id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.restaurant_idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.restaurant_idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$catatan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.catatanColKey);
    }

    @Override
    public void realmSet$catatan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.catatanColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.catatanColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.catatanColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.catatanColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PesananMerchant", 5, 0);
        builder.addPersistedProperty("idItem", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("totalHarga", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("qty", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("restaurant_id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("catatan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PesananMerchantColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PesananMerchantColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PesananMerchant";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PesananMerchant";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.PesananMerchant createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.PesananMerchant obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
            PesananMerchantColumnInfo columnInfo = (PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
            long pkColumnKey = columnInfo.idItemColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("idItem")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("idItem"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("idItem")) {
                if (json.isNull("idItem")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.PesananMerchant.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.PesananMerchant.class, json.getInt("idItem"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idItem'.");
            }
        }

        final com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) obj;
        if (json.has("totalHarga")) {
            if (json.isNull("totalHarga")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'totalHarga' to null.");
            } else {
                objProxy.realmSet$totalHarga((long) json.getLong("totalHarga"));
            }
        }
        if (json.has("qty")) {
            if (json.isNull("qty")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'qty' to null.");
            } else {
                objProxy.realmSet$qty((int) json.getInt("qty"));
            }
        }
        if (json.has("restaurant_id")) {
            if (json.isNull("restaurant_id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'restaurant_id' to null.");
            } else {
                objProxy.realmSet$restaurant_id((int) json.getInt("restaurant_id"));
            }
        }
        if (json.has("catatan")) {
            if (json.isNull("catatan")) {
                objProxy.realmSet$catatan(null);
            } else {
                objProxy.realmSet$catatan((String) json.getString("catatan"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.PesananMerchant createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.PesananMerchant obj = new com.ourdevelops.ourjek.models.PesananMerchant();
        final com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("idItem")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idItem((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idItem' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("totalHarga")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$totalHarga((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'totalHarga' to null.");
                }
            } else if (name.equals("qty")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$qty((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'qty' to null.");
                }
            } else if (name.equals("restaurant_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$restaurant_id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'restaurant_id' to null.");
                }
            } else if (name.equals("catatan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$catatan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$catatan(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idItem'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_PesananMerchantRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.PesananMerchant copyOrUpdate(Realm realm, PesananMerchantColumnInfo columnInfo, com.ourdevelops.ourjek.models.PesananMerchant object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.PesananMerchant) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.PesananMerchant realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
            long pkColumnKey = columnInfo.idItemColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.PesananMerchant copy(Realm realm, PesananMerchantColumnInfo columnInfo, com.ourdevelops.ourjek.models.PesananMerchant newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.PesananMerchant) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idItemColKey, realmObjectSource.realmGet$idItem());
        builder.addInteger(columnInfo.totalHargaColKey, realmObjectSource.realmGet$totalHarga());
        builder.addInteger(columnInfo.qtyColKey, realmObjectSource.realmGet$qty());
        builder.addInteger(columnInfo.restaurant_idColKey, realmObjectSource.realmGet$restaurant_id());
        builder.addString(columnInfo.catatanColKey, realmObjectSource.realmGet$catatan());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_PesananMerchantRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.PesananMerchant object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long tableNativePtr = table.getNativePtr();
        PesananMerchantColumnInfo columnInfo = (PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long pkColumnKey = columnInfo.idItemColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.totalHargaColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$totalHarga(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.qtyColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$qty(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.restaurant_idColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$restaurant_id(), false);
        String realmGet$catatan = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$catatan();
        if (realmGet$catatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long tableNativePtr = table.getNativePtr();
        PesananMerchantColumnInfo columnInfo = (PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long pkColumnKey = columnInfo.idItemColKey;
        com.ourdevelops.ourjek.models.PesananMerchant object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.PesananMerchant) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.totalHargaColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$totalHarga(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.qtyColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$qty(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.restaurant_idColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$restaurant_id(), false);
            String realmGet$catatan = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$catatan();
            if (realmGet$catatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.PesananMerchant object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long tableNativePtr = table.getNativePtr();
        PesananMerchantColumnInfo columnInfo = (PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long pkColumnKey = columnInfo.idItemColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
        }
        cache.put(object, colKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.totalHargaColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$totalHarga(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.qtyColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$qty(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.restaurant_idColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$restaurant_id(), false);
        String realmGet$catatan = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$catatan();
        if (realmGet$catatan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.catatanColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long tableNativePtr = table.getNativePtr();
        PesananMerchantColumnInfo columnInfo = (PesananMerchantColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.PesananMerchant.class);
        long pkColumnKey = columnInfo.idItemColKey;
        com.ourdevelops.ourjek.models.PesananMerchant object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.PesananMerchant) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$idItem());
            }
            cache.put(object, colKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.totalHargaColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$totalHarga(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.qtyColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$qty(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.restaurant_idColKey, colKey, ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$restaurant_id(), false);
            String realmGet$catatan = ((com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) object).realmGet$catatan();
            if (realmGet$catatan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.catatanColKey, colKey, realmGet$catatan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.catatanColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.PesananMerchant createDetachedCopy(com.ourdevelops.ourjek.models.PesananMerchant realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.PesananMerchant unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.PesananMerchant();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.PesananMerchant) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.PesananMerchant) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$idItem(realmSource.realmGet$idItem());
        unmanagedCopy.realmSet$totalHarga(realmSource.realmGet$totalHarga());
        unmanagedCopy.realmSet$qty(realmSource.realmGet$qty());
        unmanagedCopy.realmSet$restaurant_id(realmSource.realmGet$restaurant_id());
        unmanagedCopy.realmSet$catatan(realmSource.realmGet$catatan());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.PesananMerchant update(Realm realm, PesananMerchantColumnInfo columnInfo, com.ourdevelops.ourjek.models.PesananMerchant realmObject, com.ourdevelops.ourjek.models.PesananMerchant newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.PesananMerchant.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idItemColKey, realmObjectSource.realmGet$idItem());
        builder.addInteger(columnInfo.totalHargaColKey, realmObjectSource.realmGet$totalHarga());
        builder.addInteger(columnInfo.qtyColKey, realmObjectSource.realmGet$qty());
        builder.addInteger(columnInfo.restaurant_idColKey, realmObjectSource.realmGet$restaurant_id());
        builder.addString(columnInfo.catatanColKey, realmObjectSource.realmGet$catatan());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PesananMerchant = proxy[");
        stringBuilder.append("{idItem:");
        stringBuilder.append(realmGet$idItem());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{totalHarga:");
        stringBuilder.append(realmGet$totalHarga());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{qty:");
        stringBuilder.append(realmGet$qty());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{restaurant_id:");
        stringBuilder.append(realmGet$restaurant_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{catatan:");
        stringBuilder.append(realmGet$catatan() != null ? realmGet$catatan() : "null");
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
        com_ourdevelops_ourjek_models_PesananMerchantRealmProxy aPesananMerchant = (com_ourdevelops_ourjek_models_PesananMerchantRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aPesananMerchant.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPesananMerchant.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aPesananMerchant.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
