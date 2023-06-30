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
public class com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy extends com.ourdevelops.ourjek.models.MerchantNearModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface {

    static final class MerchantNearModelColumnInfo extends ColumnInfo {
        long id_merchantColKey;
        long nama_merchantColKey;
        long alamat_merchantColKey;
        long latitude_merchantColKey;
        long longitude_merchantColKey;
        long jam_bukaColKey;
        long jam_tutupColKey;
        long deskripsi_merchantColKey;
        long category_merchantColKey;
        long foto_merchantColKey;
        long telepon_merchantColKey;
        long status_promoColKey;
        long distanceColKey;

        MerchantNearModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MerchantNearModel");
            this.id_merchantColKey = addColumnDetails("id_merchant", "id_merchant", objectSchemaInfo);
            this.nama_merchantColKey = addColumnDetails("nama_merchant", "nama_merchant", objectSchemaInfo);
            this.alamat_merchantColKey = addColumnDetails("alamat_merchant", "alamat_merchant", objectSchemaInfo);
            this.latitude_merchantColKey = addColumnDetails("latitude_merchant", "latitude_merchant", objectSchemaInfo);
            this.longitude_merchantColKey = addColumnDetails("longitude_merchant", "longitude_merchant", objectSchemaInfo);
            this.jam_bukaColKey = addColumnDetails("jam_buka", "jam_buka", objectSchemaInfo);
            this.jam_tutupColKey = addColumnDetails("jam_tutup", "jam_tutup", objectSchemaInfo);
            this.deskripsi_merchantColKey = addColumnDetails("deskripsi_merchant", "deskripsi_merchant", objectSchemaInfo);
            this.category_merchantColKey = addColumnDetails("category_merchant", "category_merchant", objectSchemaInfo);
            this.foto_merchantColKey = addColumnDetails("foto_merchant", "foto_merchant", objectSchemaInfo);
            this.telepon_merchantColKey = addColumnDetails("telepon_merchant", "telepon_merchant", objectSchemaInfo);
            this.status_promoColKey = addColumnDetails("status_promo", "status_promo", objectSchemaInfo);
            this.distanceColKey = addColumnDetails("distance", "distance", objectSchemaInfo);
        }

        MerchantNearModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MerchantNearModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MerchantNearModelColumnInfo src = (MerchantNearModelColumnInfo) rawSrc;
            final MerchantNearModelColumnInfo dst = (MerchantNearModelColumnInfo) rawDst;
            dst.id_merchantColKey = src.id_merchantColKey;
            dst.nama_merchantColKey = src.nama_merchantColKey;
            dst.alamat_merchantColKey = src.alamat_merchantColKey;
            dst.latitude_merchantColKey = src.latitude_merchantColKey;
            dst.longitude_merchantColKey = src.longitude_merchantColKey;
            dst.jam_bukaColKey = src.jam_bukaColKey;
            dst.jam_tutupColKey = src.jam_tutupColKey;
            dst.deskripsi_merchantColKey = src.deskripsi_merchantColKey;
            dst.category_merchantColKey = src.category_merchantColKey;
            dst.foto_merchantColKey = src.foto_merchantColKey;
            dst.telepon_merchantColKey = src.telepon_merchantColKey;
            dst.status_promoColKey = src.status_promoColKey;
            dst.distanceColKey = src.distanceColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MerchantNearModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.MerchantNearModel> proxyState;

    com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MerchantNearModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.MerchantNearModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.id_merchantColKey);
    }

    @Override
    public void realmSet$id_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id_merchant' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nama_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nama_merchantColKey);
    }

    @Override
    public void realmSet$nama_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nama_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nama_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nama_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nama_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$alamat_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.alamat_merchantColKey);
    }

    @Override
    public void realmSet$alamat_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.alamat_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.alamat_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.alamat_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.alamat_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$latitude_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.latitude_merchantColKey);
    }

    @Override
    public void realmSet$latitude_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latitude_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.latitude_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latitude_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.latitude_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$longitude_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.longitude_merchantColKey);
    }

    @Override
    public void realmSet$longitude_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.longitude_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.longitude_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.longitude_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.longitude_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jam_buka() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jam_bukaColKey);
    }

    @Override
    public void realmSet$jam_buka(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jam_bukaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.jam_bukaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jam_bukaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jam_bukaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jam_tutup() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jam_tutupColKey);
    }

    @Override
    public void realmSet$jam_tutup(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jam_tutupColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.jam_tutupColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jam_tutupColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jam_tutupColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$deskripsi_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.deskripsi_merchantColKey);
    }

    @Override
    public void realmSet$deskripsi_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.deskripsi_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.deskripsi_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.deskripsi_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.deskripsi_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$category_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.category_merchantColKey);
    }

    @Override
    public void realmSet$category_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.category_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.category_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.category_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.category_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$foto_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.foto_merchantColKey);
    }

    @Override
    public void realmSet$foto_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.foto_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.foto_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.foto_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.foto_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$telepon_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.telepon_merchantColKey);
    }

    @Override
    public void realmSet$telepon_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.telepon_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.telepon_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.telepon_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.telepon_merchantColKey, value);
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
    public String realmGet$distance() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.distanceColKey);
    }

    @Override
    public void realmSet$distance(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.distanceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.distanceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.distanceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.distanceColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MerchantNearModel", 13, 0);
        builder.addPersistedProperty("id_merchant", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("alamat_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("longitude_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jam_buka", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jam_tutup", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("deskripsi_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("category_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("foto_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("telepon_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status_promo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("distance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MerchantNearModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MerchantNearModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MerchantNearModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MerchantNearModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.MerchantNearModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.MerchantNearModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
            MerchantNearModelColumnInfo columnInfo = (MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
            long pkColumnKey = columnInfo.id_merchantColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id_merchant")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id_merchant"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id_merchant")) {
                if (json.isNull("id_merchant")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.MerchantNearModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.MerchantNearModel.class, json.getString("id_merchant"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_merchant'.");
            }
        }

        final com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) obj;
        if (json.has("nama_merchant")) {
            if (json.isNull("nama_merchant")) {
                objProxy.realmSet$nama_merchant(null);
            } else {
                objProxy.realmSet$nama_merchant((String) json.getString("nama_merchant"));
            }
        }
        if (json.has("alamat_merchant")) {
            if (json.isNull("alamat_merchant")) {
                objProxy.realmSet$alamat_merchant(null);
            } else {
                objProxy.realmSet$alamat_merchant((String) json.getString("alamat_merchant"));
            }
        }
        if (json.has("latitude_merchant")) {
            if (json.isNull("latitude_merchant")) {
                objProxy.realmSet$latitude_merchant(null);
            } else {
                objProxy.realmSet$latitude_merchant((String) json.getString("latitude_merchant"));
            }
        }
        if (json.has("longitude_merchant")) {
            if (json.isNull("longitude_merchant")) {
                objProxy.realmSet$longitude_merchant(null);
            } else {
                objProxy.realmSet$longitude_merchant((String) json.getString("longitude_merchant"));
            }
        }
        if (json.has("jam_buka")) {
            if (json.isNull("jam_buka")) {
                objProxy.realmSet$jam_buka(null);
            } else {
                objProxy.realmSet$jam_buka((String) json.getString("jam_buka"));
            }
        }
        if (json.has("jam_tutup")) {
            if (json.isNull("jam_tutup")) {
                objProxy.realmSet$jam_tutup(null);
            } else {
                objProxy.realmSet$jam_tutup((String) json.getString("jam_tutup"));
            }
        }
        if (json.has("deskripsi_merchant")) {
            if (json.isNull("deskripsi_merchant")) {
                objProxy.realmSet$deskripsi_merchant(null);
            } else {
                objProxy.realmSet$deskripsi_merchant((String) json.getString("deskripsi_merchant"));
            }
        }
        if (json.has("category_merchant")) {
            if (json.isNull("category_merchant")) {
                objProxy.realmSet$category_merchant(null);
            } else {
                objProxy.realmSet$category_merchant((String) json.getString("category_merchant"));
            }
        }
        if (json.has("foto_merchant")) {
            if (json.isNull("foto_merchant")) {
                objProxy.realmSet$foto_merchant(null);
            } else {
                objProxy.realmSet$foto_merchant((String) json.getString("foto_merchant"));
            }
        }
        if (json.has("telepon_merchant")) {
            if (json.isNull("telepon_merchant")) {
                objProxy.realmSet$telepon_merchant(null);
            } else {
                objProxy.realmSet$telepon_merchant((String) json.getString("telepon_merchant"));
            }
        }
        if (json.has("status_promo")) {
            if (json.isNull("status_promo")) {
                objProxy.realmSet$status_promo(null);
            } else {
                objProxy.realmSet$status_promo((String) json.getString("status_promo"));
            }
        }
        if (json.has("distance")) {
            if (json.isNull("distance")) {
                objProxy.realmSet$distance(null);
            } else {
                objProxy.realmSet$distance((String) json.getString("distance"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.MerchantNearModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.MerchantNearModel obj = new com.ourdevelops.ourjek.models.MerchantNearModel();
        final com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_merchant(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("nama_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_merchant(null);
                }
            } else if (name.equals("alamat_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alamat_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alamat_merchant(null);
                }
            } else if (name.equals("latitude_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latitude_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$latitude_merchant(null);
                }
            } else if (name.equals("longitude_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$longitude_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$longitude_merchant(null);
                }
            } else if (name.equals("jam_buka")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jam_buka((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jam_buka(null);
                }
            } else if (name.equals("jam_tutup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jam_tutup((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jam_tutup(null);
                }
            } else if (name.equals("deskripsi_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$deskripsi_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$deskripsi_merchant(null);
                }
            } else if (name.equals("category_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$category_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$category_merchant(null);
                }
            } else if (name.equals("foto_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$foto_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$foto_merchant(null);
                }
            } else if (name.equals("telepon_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$telepon_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$telepon_merchant(null);
                }
            } else if (name.equals("status_promo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status_promo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status_promo(null);
                }
            } else if (name.equals("distance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$distance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$distance(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id_merchant'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.MerchantNearModel copyOrUpdate(Realm realm, MerchantNearModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.MerchantNearModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.MerchantNearModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.MerchantNearModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
            long pkColumnKey = columnInfo.id_merchantColKey;
            String value = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$id_merchant();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.MerchantNearModel copy(Realm realm, MerchantNearModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.MerchantNearModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.MerchantNearModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.id_merchantColKey, realmObjectSource.realmGet$id_merchant());
        builder.addString(columnInfo.nama_merchantColKey, realmObjectSource.realmGet$nama_merchant());
        builder.addString(columnInfo.alamat_merchantColKey, realmObjectSource.realmGet$alamat_merchant());
        builder.addString(columnInfo.latitude_merchantColKey, realmObjectSource.realmGet$latitude_merchant());
        builder.addString(columnInfo.longitude_merchantColKey, realmObjectSource.realmGet$longitude_merchant());
        builder.addString(columnInfo.jam_bukaColKey, realmObjectSource.realmGet$jam_buka());
        builder.addString(columnInfo.jam_tutupColKey, realmObjectSource.realmGet$jam_tutup());
        builder.addString(columnInfo.deskripsi_merchantColKey, realmObjectSource.realmGet$deskripsi_merchant());
        builder.addString(columnInfo.category_merchantColKey, realmObjectSource.realmGet$category_merchant());
        builder.addString(columnInfo.foto_merchantColKey, realmObjectSource.realmGet$foto_merchant());
        builder.addString(columnInfo.telepon_merchantColKey, realmObjectSource.realmGet$telepon_merchant());
        builder.addString(columnInfo.status_promoColKey, realmObjectSource.realmGet$status_promo());
        builder.addString(columnInfo.distanceColKey, realmObjectSource.realmGet$distance());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.MerchantNearModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long tableNativePtr = table.getNativePtr();
        MerchantNearModelColumnInfo columnInfo = (MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long pkColumnKey = columnInfo.id_merchantColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$id_merchant();
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
        String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$nama_merchant();
        if (realmGet$nama_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
        }
        String realmGet$alamat_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$alamat_merchant();
        if (realmGet$alamat_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, realmGet$alamat_merchant, false);
        }
        String realmGet$latitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$latitude_merchant();
        if (realmGet$latitude_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, realmGet$latitude_merchant, false);
        }
        String realmGet$longitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$longitude_merchant();
        if (realmGet$longitude_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, realmGet$longitude_merchant, false);
        }
        String realmGet$jam_buka = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_buka();
        if (realmGet$jam_buka != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jam_bukaColKey, colKey, realmGet$jam_buka, false);
        }
        String realmGet$jam_tutup = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_tutup();
        if (realmGet$jam_tutup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jam_tutupColKey, colKey, realmGet$jam_tutup, false);
        }
        String realmGet$deskripsi_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$deskripsi_merchant();
        if (realmGet$deskripsi_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, realmGet$deskripsi_merchant, false);
        }
        String realmGet$category_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$category_merchant();
        if (realmGet$category_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_merchantColKey, colKey, realmGet$category_merchant, false);
        }
        String realmGet$foto_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$foto_merchant();
        if (realmGet$foto_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_merchantColKey, colKey, realmGet$foto_merchant, false);
        }
        String realmGet$telepon_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$telepon_merchant();
        if (realmGet$telepon_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, realmGet$telepon_merchant, false);
        }
        String realmGet$status_promo = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$status_promo();
        if (realmGet$status_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
        }
        String realmGet$distance = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$distance();
        if (realmGet$distance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long tableNativePtr = table.getNativePtr();
        MerchantNearModelColumnInfo columnInfo = (MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long pkColumnKey = columnInfo.id_merchantColKey;
        com.ourdevelops.ourjek.models.MerchantNearModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.MerchantNearModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$id_merchant();
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
            String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$nama_merchant();
            if (realmGet$nama_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
            }
            String realmGet$alamat_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$alamat_merchant();
            if (realmGet$alamat_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, realmGet$alamat_merchant, false);
            }
            String realmGet$latitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$latitude_merchant();
            if (realmGet$latitude_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, realmGet$latitude_merchant, false);
            }
            String realmGet$longitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$longitude_merchant();
            if (realmGet$longitude_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, realmGet$longitude_merchant, false);
            }
            String realmGet$jam_buka = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_buka();
            if (realmGet$jam_buka != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jam_bukaColKey, colKey, realmGet$jam_buka, false);
            }
            String realmGet$jam_tutup = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_tutup();
            if (realmGet$jam_tutup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jam_tutupColKey, colKey, realmGet$jam_tutup, false);
            }
            String realmGet$deskripsi_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$deskripsi_merchant();
            if (realmGet$deskripsi_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, realmGet$deskripsi_merchant, false);
            }
            String realmGet$category_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$category_merchant();
            if (realmGet$category_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_merchantColKey, colKey, realmGet$category_merchant, false);
            }
            String realmGet$foto_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$foto_merchant();
            if (realmGet$foto_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_merchantColKey, colKey, realmGet$foto_merchant, false);
            }
            String realmGet$telepon_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$telepon_merchant();
            if (realmGet$telepon_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, realmGet$telepon_merchant, false);
            }
            String realmGet$status_promo = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$status_promo();
            if (realmGet$status_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
            }
            String realmGet$distance = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$distance();
            if (realmGet$distance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.MerchantNearModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long tableNativePtr = table.getNativePtr();
        MerchantNearModelColumnInfo columnInfo = (MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long pkColumnKey = columnInfo.id_merchantColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$id_merchant();
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
        String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$nama_merchant();
        if (realmGet$nama_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_merchantColKey, colKey, false);
        }
        String realmGet$alamat_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$alamat_merchant();
        if (realmGet$alamat_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, realmGet$alamat_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, false);
        }
        String realmGet$latitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$latitude_merchant();
        if (realmGet$latitude_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, realmGet$latitude_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, false);
        }
        String realmGet$longitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$longitude_merchant();
        if (realmGet$longitude_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, realmGet$longitude_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, false);
        }
        String realmGet$jam_buka = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_buka();
        if (realmGet$jam_buka != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jam_bukaColKey, colKey, realmGet$jam_buka, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jam_bukaColKey, colKey, false);
        }
        String realmGet$jam_tutup = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_tutup();
        if (realmGet$jam_tutup != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jam_tutupColKey, colKey, realmGet$jam_tutup, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jam_tutupColKey, colKey, false);
        }
        String realmGet$deskripsi_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$deskripsi_merchant();
        if (realmGet$deskripsi_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, realmGet$deskripsi_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, false);
        }
        String realmGet$category_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$category_merchant();
        if (realmGet$category_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.category_merchantColKey, colKey, realmGet$category_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.category_merchantColKey, colKey, false);
        }
        String realmGet$foto_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$foto_merchant();
        if (realmGet$foto_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.foto_merchantColKey, colKey, realmGet$foto_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.foto_merchantColKey, colKey, false);
        }
        String realmGet$telepon_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$telepon_merchant();
        if (realmGet$telepon_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, realmGet$telepon_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, false);
        }
        String realmGet$status_promo = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$status_promo();
        if (realmGet$status_promo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.status_promoColKey, colKey, false);
        }
        String realmGet$distance = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$distance();
        if (realmGet$distance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.distanceColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long tableNativePtr = table.getNativePtr();
        MerchantNearModelColumnInfo columnInfo = (MerchantNearModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        long pkColumnKey = columnInfo.id_merchantColKey;
        com.ourdevelops.ourjek.models.MerchantNearModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.MerchantNearModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$id_merchant();
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
            String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$nama_merchant();
            if (realmGet$nama_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_merchantColKey, colKey, false);
            }
            String realmGet$alamat_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$alamat_merchant();
            if (realmGet$alamat_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, realmGet$alamat_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamat_merchantColKey, colKey, false);
            }
            String realmGet$latitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$latitude_merchant();
            if (realmGet$latitude_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, realmGet$latitude_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latitude_merchantColKey, colKey, false);
            }
            String realmGet$longitude_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$longitude_merchant();
            if (realmGet$longitude_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, realmGet$longitude_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.longitude_merchantColKey, colKey, false);
            }
            String realmGet$jam_buka = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_buka();
            if (realmGet$jam_buka != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jam_bukaColKey, colKey, realmGet$jam_buka, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jam_bukaColKey, colKey, false);
            }
            String realmGet$jam_tutup = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$jam_tutup();
            if (realmGet$jam_tutup != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jam_tutupColKey, colKey, realmGet$jam_tutup, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jam_tutupColKey, colKey, false);
            }
            String realmGet$deskripsi_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$deskripsi_merchant();
            if (realmGet$deskripsi_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, realmGet$deskripsi_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.deskripsi_merchantColKey, colKey, false);
            }
            String realmGet$category_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$category_merchant();
            if (realmGet$category_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.category_merchantColKey, colKey, realmGet$category_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.category_merchantColKey, colKey, false);
            }
            String realmGet$foto_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$foto_merchant();
            if (realmGet$foto_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.foto_merchantColKey, colKey, realmGet$foto_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.foto_merchantColKey, colKey, false);
            }
            String realmGet$telepon_merchant = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$telepon_merchant();
            if (realmGet$telepon_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, realmGet$telepon_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.telepon_merchantColKey, colKey, false);
            }
            String realmGet$status_promo = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$status_promo();
            if (realmGet$status_promo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.status_promoColKey, colKey, realmGet$status_promo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.status_promoColKey, colKey, false);
            }
            String realmGet$distance = ((com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) object).realmGet$distance();
            if (realmGet$distance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.distanceColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.MerchantNearModel createDetachedCopy(com.ourdevelops.ourjek.models.MerchantNearModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.MerchantNearModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.MerchantNearModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.MerchantNearModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.MerchantNearModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id_merchant(realmSource.realmGet$id_merchant());
        unmanagedCopy.realmSet$nama_merchant(realmSource.realmGet$nama_merchant());
        unmanagedCopy.realmSet$alamat_merchant(realmSource.realmGet$alamat_merchant());
        unmanagedCopy.realmSet$latitude_merchant(realmSource.realmGet$latitude_merchant());
        unmanagedCopy.realmSet$longitude_merchant(realmSource.realmGet$longitude_merchant());
        unmanagedCopy.realmSet$jam_buka(realmSource.realmGet$jam_buka());
        unmanagedCopy.realmSet$jam_tutup(realmSource.realmGet$jam_tutup());
        unmanagedCopy.realmSet$deskripsi_merchant(realmSource.realmGet$deskripsi_merchant());
        unmanagedCopy.realmSet$category_merchant(realmSource.realmGet$category_merchant());
        unmanagedCopy.realmSet$foto_merchant(realmSource.realmGet$foto_merchant());
        unmanagedCopy.realmSet$telepon_merchant(realmSource.realmGet$telepon_merchant());
        unmanagedCopy.realmSet$status_promo(realmSource.realmGet$status_promo());
        unmanagedCopy.realmSet$distance(realmSource.realmGet$distance());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.MerchantNearModel update(Realm realm, MerchantNearModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.MerchantNearModel realmObject, com.ourdevelops.ourjek.models.MerchantNearModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.MerchantNearModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.id_merchantColKey, realmObjectSource.realmGet$id_merchant());
        builder.addString(columnInfo.nama_merchantColKey, realmObjectSource.realmGet$nama_merchant());
        builder.addString(columnInfo.alamat_merchantColKey, realmObjectSource.realmGet$alamat_merchant());
        builder.addString(columnInfo.latitude_merchantColKey, realmObjectSource.realmGet$latitude_merchant());
        builder.addString(columnInfo.longitude_merchantColKey, realmObjectSource.realmGet$longitude_merchant());
        builder.addString(columnInfo.jam_bukaColKey, realmObjectSource.realmGet$jam_buka());
        builder.addString(columnInfo.jam_tutupColKey, realmObjectSource.realmGet$jam_tutup());
        builder.addString(columnInfo.deskripsi_merchantColKey, realmObjectSource.realmGet$deskripsi_merchant());
        builder.addString(columnInfo.category_merchantColKey, realmObjectSource.realmGet$category_merchant());
        builder.addString(columnInfo.foto_merchantColKey, realmObjectSource.realmGet$foto_merchant());
        builder.addString(columnInfo.telepon_merchantColKey, realmObjectSource.realmGet$telepon_merchant());
        builder.addString(columnInfo.status_promoColKey, realmObjectSource.realmGet$status_promo());
        builder.addString(columnInfo.distanceColKey, realmObjectSource.realmGet$distance());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MerchantNearModel = proxy[");
        stringBuilder.append("{id_merchant:");
        stringBuilder.append(realmGet$id_merchant() != null ? realmGet$id_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama_merchant:");
        stringBuilder.append(realmGet$nama_merchant() != null ? realmGet$nama_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alamat_merchant:");
        stringBuilder.append(realmGet$alamat_merchant() != null ? realmGet$alamat_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latitude_merchant:");
        stringBuilder.append(realmGet$latitude_merchant() != null ? realmGet$latitude_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{longitude_merchant:");
        stringBuilder.append(realmGet$longitude_merchant() != null ? realmGet$longitude_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jam_buka:");
        stringBuilder.append(realmGet$jam_buka() != null ? realmGet$jam_buka() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jam_tutup:");
        stringBuilder.append(realmGet$jam_tutup() != null ? realmGet$jam_tutup() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{deskripsi_merchant:");
        stringBuilder.append(realmGet$deskripsi_merchant() != null ? realmGet$deskripsi_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{category_merchant:");
        stringBuilder.append(realmGet$category_merchant() != null ? realmGet$category_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{foto_merchant:");
        stringBuilder.append(realmGet$foto_merchant() != null ? realmGet$foto_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{telepon_merchant:");
        stringBuilder.append(realmGet$telepon_merchant() != null ? realmGet$telepon_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status_promo:");
        stringBuilder.append(realmGet$status_promo() != null ? realmGet$status_promo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{distance:");
        stringBuilder.append(realmGet$distance() != null ? realmGet$distance() : "null");
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
        com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy aMerchantNearModel = (com_ourdevelops_ourjek_models_MerchantNearModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aMerchantNearModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMerchantNearModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aMerchantNearModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
