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
public class com_ourdevelops_ourjek_models_ItemModelRealmProxy extends com.ourdevelops.ourjek.models.ItemModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface {

    static final class ItemModelColumnInfo extends ColumnInfo {
        long id_itemColKey;
        long nama_itemColKey;
        long harga_itemColKey;
        long harga_promoColKey;
        long kategori_itemColKey;
        long deskripsi_itemColKey;
        long foto_itemColKey;
        long status_promoColKey;
        long discountColKey;
        long typeColKey;

        ItemModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ItemModel");
            this.id_itemColKey = addColumnDetails("id_item", "id_item", objectSchemaInfo);
            this.nama_itemColKey = addColumnDetails("nama_item", "nama_item", objectSchemaInfo);
            this.harga_itemColKey = addColumnDetails("harga_item", "harga_item", objectSchemaInfo);
            this.harga_promoColKey = addColumnDetails("harga_promo", "harga_promo", objectSchemaInfo);
            this.kategori_itemColKey = addColumnDetails("kategori_item", "kategori_item", objectSchemaInfo);
            this.deskripsi_itemColKey = addColumnDetails("deskripsi_item", "deskripsi_item", objectSchemaInfo);
            this.foto_itemColKey = addColumnDetails("foto_item", "foto_item", objectSchemaInfo);
            this.status_promoColKey = addColumnDetails("status_promo", "status_promo", objectSchemaInfo);
            this.discountColKey = addColumnDetails("discount", "discount", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
        }

        ItemModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ItemModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ItemModelColumnInfo src = (ItemModelColumnInfo) rawSrc;
            final ItemModelColumnInfo dst = (ItemModelColumnInfo) rawDst;
            dst.id_itemColKey = src.id_itemColKey;
            dst.nama_itemColKey = src.nama_itemColKey;
            dst.harga_itemColKey = src.harga_itemColKey;
            dst.harga_promoColKey = src.harga_promoColKey;
            dst.kategori_itemColKey = src.kategori_itemColKey;
            dst.deskripsi_itemColKey = src.deskripsi_itemColKey;
            dst.foto_itemColKey = src.foto_itemColKey;
            dst.status_promoColKey = src.status_promoColKey;
            dst.discountColKey = src.discountColKey;
            dst.typeColKey = src.typeColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ItemModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.ItemModel> proxyState;

    com_ourdevelops_ourjek_models_ItemModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ItemModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.ItemModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.id_itemColKey);
    }

    @Override
    public void realmSet$id_item(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_item' cannot be changed after object was created.");
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
    public String realmGet$harga_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.harga_itemColKey);
    }

    @Override
    public void realmSet$harga_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.harga_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.harga_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.harga_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.harga_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$harga_promo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.harga_promoColKey);
    }

    @Override
    public void realmSet$harga_promo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.harga_promoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.harga_promoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.harga_promoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.harga_promoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kategori_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kategori_itemColKey);
    }

    @Override
    public void realmSet$kategori_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kategori_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kategori_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kategori_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kategori_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$deskripsi_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deskripsi_itemColKey);
    }

    @Override
    public void realmSet$deskripsi_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deskripsi_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.deskripsi_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deskripsi_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deskripsi_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$foto_item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.foto_itemColKey);
    }

    @Override
    public void realmSet$foto_item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.foto_itemColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.foto_itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.foto_itemColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.foto_itemColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status_promo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.status_promoColKey);
    }

    @Override
    public void realmSet$status_promo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.status_promoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.status_promoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.status_promoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.status_promoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$discount() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.discountColKey);
    }

    @Override
    public void realmSet$discount(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.discountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.discountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.discountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.discountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ItemModel", 10, 0);
        builder.addPersistedProperty("id_item", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nama_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("harga_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("harga_promo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kategori_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deskripsi_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("foto_item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status_promo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("discount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ItemModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ItemModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ItemModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ItemModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.ItemModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.ItemModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
            ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
            long pkColumnKey = columnInfo.id_itemColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id_item")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id_item"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_item")) {
                if (json.isNull("id_item")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.ItemModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.ItemModel.class, json.getInt("id_item"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_item'.");
            }
        }

        final com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) obj;
        if (json.has("nama_item")) {
            if (json.isNull("nama_item")) {
                objProxy.realmSet$nama_item(null);
            } else {
                objProxy.realmSet$nama_item((String) json.getString("nama_item"));
            }
        }
        if (json.has("harga_item")) {
            if (json.isNull("harga_item")) {
                objProxy.realmSet$harga_item(null);
            } else {
                objProxy.realmSet$harga_item((String) json.getString("harga_item"));
            }
        }
        if (json.has("harga_promo")) {
            if (json.isNull("harga_promo")) {
                objProxy.realmSet$harga_promo(null);
            } else {
                objProxy.realmSet$harga_promo((String) json.getString("harga_promo"));
            }
        }
        if (json.has("kategori_item")) {
            if (json.isNull("kategori_item")) {
                objProxy.realmSet$kategori_item(null);
            } else {
                objProxy.realmSet$kategori_item((String) json.getString("kategori_item"));
            }
        }
        if (json.has("deskripsi_item")) {
            if (json.isNull("deskripsi_item")) {
                objProxy.realmSet$deskripsi_item(null);
            } else {
                objProxy.realmSet$deskripsi_item((String) json.getString("deskripsi_item"));
            }
        }
        if (json.has("foto_item")) {
            if (json.isNull("foto_item")) {
                objProxy.realmSet$foto_item(null);
            } else {
                objProxy.realmSet$foto_item((String) json.getString("foto_item"));
            }
        }
        if (json.has("status_promo")) {
            if (json.isNull("status_promo")) {
                objProxy.realmSet$status_promo(null);
            } else {
                objProxy.realmSet$status_promo((String) json.getString("status_promo"));
            }
        }
        if (json.has("discount")) {
            if (json.isNull("discount")) {
                objProxy.realmSet$discount(null);
            } else {
                objProxy.realmSet$discount((String) json.getString("discount"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.ItemModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.ItemModel obj = new com.ourdevelops.ourjek.models.ItemModel();
        final com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_item((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id_item' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nama_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_item(null);
                }
            } else if (name.equals("harga_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$harga_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$harga_item(null);
                }
            } else if (name.equals("harga_promo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$harga_promo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$harga_promo(null);
                }
            } else if (name.equals("kategori_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kategori_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kategori_item(null);
                }
            } else if (name.equals("deskripsi_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deskripsi_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deskripsi_item(null);
                }
            } else if (name.equals("foto_item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$foto_item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$foto_item(null);
                }
            } else if (name.equals("status_promo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status_promo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status_promo(null);
                }
            } else if (name.equals("discount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$discount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$discount(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_item'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_ItemModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.ItemModel copyOrUpdate(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.ItemModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.ItemModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.ItemModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
            long pkColumnKey = columnInfo.id_itemColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.ItemModel copy(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.ItemModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.ItemModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.id_itemColKey, realmObjectSource.realmGet$id_item());
        builder.addString(columnInfo.nama_itemColKey, realmObjectSource.realmGet$nama_item());
        builder.addString(columnInfo.harga_itemColKey, realmObjectSource.realmGet$harga_item());
        builder.addString(columnInfo.harga_promoColKey, realmObjectSource.realmGet$harga_promo());
        builder.addString(columnInfo.kategori_itemColKey, realmObjectSource.realmGet$kategori_item());
        builder.addString(columnInfo.deskripsi_itemColKey, realmObjectSource.realmGet$deskripsi_item());
        builder.addString(columnInfo.foto_itemColKey, realmObjectSource.realmGet$foto_item());
        builder.addString(columnInfo.status_promoColKey, realmObjectSource.realmGet$status_promo());
        builder.addString(columnInfo.discountColKey, realmObjectSource.realmGet$discount());
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_ItemModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.ItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
        long pkColumnKey = columnInfo.id_itemColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$nama_item();
        if (realmGet$nama_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
        }
        String realmGet$harga_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_item();
        if (realmGet$harga_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.harga_itemColKey, colKey, realmGet$harga_item, false);
        }
        String realmGet$harga_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_promo();
        if (realmGet$harga_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.harga_promoColKey, colKey, realmGet$harga_promo, false);
        }
        String realmGet$kategori_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$kategori_item();
        if (realmGet$kategori_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kategori_itemColKey, colKey, realmGet$kategori_item, false);
        }
        String realmGet$deskripsi_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$deskripsi_item();
        if (realmGet$deskripsi_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, realmGet$deskripsi_item, false);
        }
        String realmGet$foto_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$foto_item();
        if (realmGet$foto_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_itemColKey, colKey, realmGet$foto_item, false);
        }
        String realmGet$status_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$status_promo();
        if (realmGet$status_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
        }
        String realmGet$discount = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$discount();
        if (realmGet$discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
        }
        String realmGet$type = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
        long pkColumnKey = columnInfo.id_itemColKey;
        com.ourdevelops.ourjek.models.ItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.ItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$nama_item();
            if (realmGet$nama_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
            }
            String realmGet$harga_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_item();
            if (realmGet$harga_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.harga_itemColKey, colKey, realmGet$harga_item, false);
            }
            String realmGet$harga_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_promo();
            if (realmGet$harga_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.harga_promoColKey, colKey, realmGet$harga_promo, false);
            }
            String realmGet$kategori_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$kategori_item();
            if (realmGet$kategori_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kategori_itemColKey, colKey, realmGet$kategori_item, false);
            }
            String realmGet$deskripsi_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$deskripsi_item();
            if (realmGet$deskripsi_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, realmGet$deskripsi_item, false);
            }
            String realmGet$foto_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$foto_item();
            if (realmGet$foto_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_itemColKey, colKey, realmGet$foto_item, false);
            }
            String realmGet$status_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$status_promo();
            if (realmGet$status_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
            }
            String realmGet$discount = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$discount();
            if (realmGet$discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
            }
            String realmGet$type = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.ItemModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
        long pkColumnKey = columnInfo.id_itemColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
        }
        cache.put(object, colKey);
        String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$nama_item();
        if (realmGet$nama_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_itemColKey, colKey, false);
        }
        String realmGet$harga_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_item();
        if (realmGet$harga_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.harga_itemColKey, colKey, realmGet$harga_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.harga_itemColKey, colKey, false);
        }
        String realmGet$harga_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_promo();
        if (realmGet$harga_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.harga_promoColKey, colKey, realmGet$harga_promo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.harga_promoColKey, colKey, false);
        }
        String realmGet$kategori_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$kategori_item();
        if (realmGet$kategori_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kategori_itemColKey, colKey, realmGet$kategori_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kategori_itemColKey, colKey, false);
        }
        String realmGet$deskripsi_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$deskripsi_item();
        if (realmGet$deskripsi_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, realmGet$deskripsi_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, false);
        }
        String realmGet$foto_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$foto_item();
        if (realmGet$foto_item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_itemColKey, colKey, realmGet$foto_item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.foto_itemColKey, colKey, false);
        }
        String realmGet$status_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$status_promo();
        if (realmGet$status_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.status_promoColKey, colKey, false);
        }
        String realmGet$discount = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$discount();
        if (realmGet$discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.discountColKey, colKey, false);
        }
        String realmGet$type = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        long tableNativePtr = table.getNativePtr();
        ItemModelColumnInfo columnInfo = (ItemModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.ItemModel.class);
        long pkColumnKey = columnInfo.id_itemColKey;
        com.ourdevelops.ourjek.models.ItemModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.ItemModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$id_item());
            }
            cache.put(object, colKey);
            String realmGet$nama_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$nama_item();
            if (realmGet$nama_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_itemColKey, colKey, realmGet$nama_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_itemColKey, colKey, false);
            }
            String realmGet$harga_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_item();
            if (realmGet$harga_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.harga_itemColKey, colKey, realmGet$harga_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.harga_itemColKey, colKey, false);
            }
            String realmGet$harga_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$harga_promo();
            if (realmGet$harga_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.harga_promoColKey, colKey, realmGet$harga_promo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.harga_promoColKey, colKey, false);
            }
            String realmGet$kategori_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$kategori_item();
            if (realmGet$kategori_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kategori_itemColKey, colKey, realmGet$kategori_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kategori_itemColKey, colKey, false);
            }
            String realmGet$deskripsi_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$deskripsi_item();
            if (realmGet$deskripsi_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, realmGet$deskripsi_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deskripsi_itemColKey, colKey, false);
            }
            String realmGet$foto_item = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$foto_item();
            if (realmGet$foto_item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_itemColKey, colKey, realmGet$foto_item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.foto_itemColKey, colKey, false);
            }
            String realmGet$status_promo = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$status_promo();
            if (realmGet$status_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.status_promoColKey, colKey, false);
            }
            String realmGet$discount = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$discount();
            if (realmGet$discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.discountColKey, colKey, false);
            }
            String realmGet$type = ((com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, colKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.ItemModel createDetachedCopy(com.ourdevelops.ourjek.models.ItemModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.ItemModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.ItemModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.ItemModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.ItemModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_item(realmSource.realmGet$id_item());
        unmanagedCopy.realmSet$nama_item(realmSource.realmGet$nama_item());
        unmanagedCopy.realmSet$harga_item(realmSource.realmGet$harga_item());
        unmanagedCopy.realmSet$harga_promo(realmSource.realmGet$harga_promo());
        unmanagedCopy.realmSet$kategori_item(realmSource.realmGet$kategori_item());
        unmanagedCopy.realmSet$deskripsi_item(realmSource.realmGet$deskripsi_item());
        unmanagedCopy.realmSet$foto_item(realmSource.realmGet$foto_item());
        unmanagedCopy.realmSet$status_promo(realmSource.realmGet$status_promo());
        unmanagedCopy.realmSet$discount(realmSource.realmGet$discount());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.ItemModel update(Realm realm, ItemModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.ItemModel realmObject, com.ourdevelops.ourjek.models.ItemModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_ItemModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.ItemModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.id_itemColKey, realmObjectSource.realmGet$id_item());
        builder.addString(columnInfo.nama_itemColKey, realmObjectSource.realmGet$nama_item());
        builder.addString(columnInfo.harga_itemColKey, realmObjectSource.realmGet$harga_item());
        builder.addString(columnInfo.harga_promoColKey, realmObjectSource.realmGet$harga_promo());
        builder.addString(columnInfo.kategori_itemColKey, realmObjectSource.realmGet$kategori_item());
        builder.addString(columnInfo.deskripsi_itemColKey, realmObjectSource.realmGet$deskripsi_item());
        builder.addString(columnInfo.foto_itemColKey, realmObjectSource.realmGet$foto_item());
        builder.addString(columnInfo.status_promoColKey, realmObjectSource.realmGet$status_promo());
        builder.addString(columnInfo.discountColKey, realmObjectSource.realmGet$discount());
        builder.addString(columnInfo.typeColKey, realmObjectSource.realmGet$type());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ItemModel = proxy[");
        stringBuilder.append("{id_item:");
        stringBuilder.append(realmGet$id_item());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama_item:");
        stringBuilder.append(realmGet$nama_item() != null ? realmGet$nama_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{harga_item:");
        stringBuilder.append(realmGet$harga_item() != null ? realmGet$harga_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{harga_promo:");
        stringBuilder.append(realmGet$harga_promo() != null ? realmGet$harga_promo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kategori_item:");
        stringBuilder.append(realmGet$kategori_item() != null ? realmGet$kategori_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deskripsi_item:");
        stringBuilder.append(realmGet$deskripsi_item() != null ? realmGet$deskripsi_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{foto_item:");
        stringBuilder.append(realmGet$foto_item() != null ? realmGet$foto_item() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status_promo:");
        stringBuilder.append(realmGet$status_promo() != null ? realmGet$status_promo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{discount:");
        stringBuilder.append(realmGet$discount() != null ? realmGet$discount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
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
        com_ourdevelops_ourjek_models_ItemModelRealmProxy aItemModel = (com_ourdevelops_ourjek_models_ItemModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aItemModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aItemModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aItemModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
