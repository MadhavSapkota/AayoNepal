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
public class com_ourdevelops_ourjek_models_DriverModelRealmProxy extends com.ourdevelops.ourjek.models.DriverModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface {

    static final class DriverModelColumnInfo extends ColumnInfo {
        long idColKey;
        long namaDriverColKey;
        long latitudeColKey;
        long longitudeColKey;
        long updateAtColKey;
        long noTeleponColKey;
        long fotoColKey;
        long regIdColKey;
        long driverJobColKey;
        long distanceColKey;
        long merekColKey;
        long nomor_kendaraanColKey;
        long warnaColKey;
        long tipeColKey;
        long bearingColKey;
        long ratingColKey;

        DriverModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(16);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("DriverModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.namaDriverColKey = addColumnDetails("namaDriver", "namaDriver", objectSchemaInfo);
            this.latitudeColKey = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeColKey = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.updateAtColKey = addColumnDetails("updateAt", "updateAt", objectSchemaInfo);
            this.noTeleponColKey = addColumnDetails("noTelepon", "noTelepon", objectSchemaInfo);
            this.fotoColKey = addColumnDetails("foto", "foto", objectSchemaInfo);
            this.regIdColKey = addColumnDetails("regId", "regId", objectSchemaInfo);
            this.driverJobColKey = addColumnDetails("driverJob", "driverJob", objectSchemaInfo);
            this.distanceColKey = addColumnDetails("distance", "distance", objectSchemaInfo);
            this.merekColKey = addColumnDetails("merek", "merek", objectSchemaInfo);
            this.nomor_kendaraanColKey = addColumnDetails("nomor_kendaraan", "nomor_kendaraan", objectSchemaInfo);
            this.warnaColKey = addColumnDetails("warna", "warna", objectSchemaInfo);
            this.tipeColKey = addColumnDetails("tipe", "tipe", objectSchemaInfo);
            this.bearingColKey = addColumnDetails("bearing", "bearing", objectSchemaInfo);
            this.ratingColKey = addColumnDetails("rating", "rating", objectSchemaInfo);
        }

        DriverModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DriverModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DriverModelColumnInfo src = (DriverModelColumnInfo) rawSrc;
            final DriverModelColumnInfo dst = (DriverModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.namaDriverColKey = src.namaDriverColKey;
            dst.latitudeColKey = src.latitudeColKey;
            dst.longitudeColKey = src.longitudeColKey;
            dst.updateAtColKey = src.updateAtColKey;
            dst.noTeleponColKey = src.noTeleponColKey;
            dst.fotoColKey = src.fotoColKey;
            dst.regIdColKey = src.regIdColKey;
            dst.driverJobColKey = src.driverJobColKey;
            dst.distanceColKey = src.distanceColKey;
            dst.merekColKey = src.merekColKey;
            dst.nomor_kendaraanColKey = src.nomor_kendaraanColKey;
            dst.warnaColKey = src.warnaColKey;
            dst.tipeColKey = src.tipeColKey;
            dst.bearingColKey = src.bearingColKey;
            dst.ratingColKey = src.ratingColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DriverModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.DriverModel> proxyState;

    com_ourdevelops_ourjek_models_DriverModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DriverModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.DriverModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaDriver() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaDriverColKey);
    }

    @Override
    public void realmSet$namaDriver(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaDriverColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaDriverColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaDriverColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaDriverColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$latitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latitudeColKey);
    }

    @Override
    public void realmSet$latitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$longitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.longitudeColKey);
    }

    @Override
    public void realmSet$longitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.longitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.longitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$updateAt() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.updateAtColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.updateAtColKey);
    }

    @Override
    public void realmSet$updateAt(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.updateAtColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.updateAtColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.updateAtColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.updateAtColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$noTelepon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.noTeleponColKey);
    }

    @Override
    public void realmSet$noTelepon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.noTeleponColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.noTeleponColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.noTeleponColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.noTeleponColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$foto() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fotoColKey);
    }

    @Override
    public void realmSet$foto(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fotoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fotoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fotoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fotoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$regId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.regIdColKey);
    }

    @Override
    public void realmSet$regId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.regIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.regIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.regIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.regIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$driverJob() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.driverJobColKey);
    }

    @Override
    public void realmSet$driverJob(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.driverJobColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.driverJobColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.driverJobColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.driverJobColKey, value);
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

    @Override
    @SuppressWarnings("cast")
    public String realmGet$merek() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.merekColKey);
    }

    @Override
    public void realmSet$merek(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.merekColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.merekColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.merekColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.merekColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nomor_kendaraan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nomor_kendaraanColKey);
    }

    @Override
    public void realmSet$nomor_kendaraan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nomor_kendaraanColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nomor_kendaraanColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nomor_kendaraanColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nomor_kendaraanColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$warna() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.warnaColKey);
    }

    @Override
    public void realmSet$warna(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.warnaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.warnaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.warnaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.warnaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tipe() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tipeColKey);
    }

    @Override
    public void realmSet$tipe(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tipeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tipeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tipeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tipeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$bearing() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bearingColKey);
    }

    @Override
    public void realmSet$bearing(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bearingColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.bearingColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bearingColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bearingColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rating() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ratingColKey);
    }

    @Override
    public void realmSet$rating(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ratingColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ratingColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ratingColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ratingColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("DriverModel", 16, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaDriver", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("longitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("updateAt", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("noTelepon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("foto", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("regId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("driverJob", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("distance", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("merek", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nomor_kendaraan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("warna", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tipe", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("bearing", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("rating", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DriverModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DriverModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "DriverModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DriverModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.DriverModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.DriverModel obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.DriverModel.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("namaDriver")) {
            if (json.isNull("namaDriver")) {
                objProxy.realmSet$namaDriver(null);
            } else {
                objProxy.realmSet$namaDriver((String) json.getString("namaDriver"));
            }
        }
        if (json.has("latitude")) {
            if (json.isNull("latitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
            } else {
                objProxy.realmSet$latitude((double) json.getDouble("latitude"));
            }
        }
        if (json.has("longitude")) {
            if (json.isNull("longitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
            } else {
                objProxy.realmSet$longitude((double) json.getDouble("longitude"));
            }
        }
        if (json.has("updateAt")) {
            if (json.isNull("updateAt")) {
                objProxy.realmSet$updateAt(null);
            } else {
                Object timestamp = json.get("updateAt");
                if (timestamp instanceof String) {
                    objProxy.realmSet$updateAt(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$updateAt(new Date(json.getLong("updateAt")));
                }
            }
        }
        if (json.has("noTelepon")) {
            if (json.isNull("noTelepon")) {
                objProxy.realmSet$noTelepon(null);
            } else {
                objProxy.realmSet$noTelepon((String) json.getString("noTelepon"));
            }
        }
        if (json.has("foto")) {
            if (json.isNull("foto")) {
                objProxy.realmSet$foto(null);
            } else {
                objProxy.realmSet$foto((String) json.getString("foto"));
            }
        }
        if (json.has("regId")) {
            if (json.isNull("regId")) {
                objProxy.realmSet$regId(null);
            } else {
                objProxy.realmSet$regId((String) json.getString("regId"));
            }
        }
        if (json.has("driverJob")) {
            if (json.isNull("driverJob")) {
                objProxy.realmSet$driverJob(null);
            } else {
                objProxy.realmSet$driverJob((String) json.getString("driverJob"));
            }
        }
        if (json.has("distance")) {
            if (json.isNull("distance")) {
                objProxy.realmSet$distance(null);
            } else {
                objProxy.realmSet$distance((String) json.getString("distance"));
            }
        }
        if (json.has("merek")) {
            if (json.isNull("merek")) {
                objProxy.realmSet$merek(null);
            } else {
                objProxy.realmSet$merek((String) json.getString("merek"));
            }
        }
        if (json.has("nomor_kendaraan")) {
            if (json.isNull("nomor_kendaraan")) {
                objProxy.realmSet$nomor_kendaraan(null);
            } else {
                objProxy.realmSet$nomor_kendaraan((String) json.getString("nomor_kendaraan"));
            }
        }
        if (json.has("warna")) {
            if (json.isNull("warna")) {
                objProxy.realmSet$warna(null);
            } else {
                objProxy.realmSet$warna((String) json.getString("warna"));
            }
        }
        if (json.has("tipe")) {
            if (json.isNull("tipe")) {
                objProxy.realmSet$tipe(null);
            } else {
                objProxy.realmSet$tipe((String) json.getString("tipe"));
            }
        }
        if (json.has("bearing")) {
            if (json.isNull("bearing")) {
                objProxy.realmSet$bearing(null);
            } else {
                objProxy.realmSet$bearing((String) json.getString("bearing"));
            }
        }
        if (json.has("rating")) {
            if (json.isNull("rating")) {
                objProxy.realmSet$rating(null);
            } else {
                objProxy.realmSet$rating((String) json.getString("rating"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.DriverModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.DriverModel obj = new com.ourdevelops.ourjek.models.DriverModel();
        final com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("namaDriver")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaDriver((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaDriver(null);
                }
            } else if (name.equals("latitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
                }
            } else if (name.equals("longitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$longitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
                }
            } else if (name.equals("updateAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$updateAt(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$updateAt(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$updateAt(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("noTelepon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$noTelepon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$noTelepon(null);
                }
            } else if (name.equals("foto")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$foto((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$foto(null);
                }
            } else if (name.equals("regId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$regId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$regId(null);
                }
            } else if (name.equals("driverJob")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$driverJob((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$driverJob(null);
                }
            } else if (name.equals("distance")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$distance((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$distance(null);
                }
            } else if (name.equals("merek")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$merek((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$merek(null);
                }
            } else if (name.equals("nomor_kendaraan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nomor_kendaraan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nomor_kendaraan(null);
                }
            } else if (name.equals("warna")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$warna((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$warna(null);
                }
            } else if (name.equals("tipe")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tipe((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tipe(null);
                }
            } else if (name.equals("bearing")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bearing((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$bearing(null);
                }
            } else if (name.equals("rating")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rating((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rating(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_DriverModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.DriverModel copyOrUpdate(Realm realm, DriverModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.DriverModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.DriverModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.DriverModel copy(Realm realm, DriverModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.DriverModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.DriverModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.DriverModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.namaDriverColKey, realmObjectSource.realmGet$namaDriver());
        builder.addDouble(columnInfo.latitudeColKey, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeColKey, realmObjectSource.realmGet$longitude());
        builder.addDate(columnInfo.updateAtColKey, realmObjectSource.realmGet$updateAt());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.fotoColKey, realmObjectSource.realmGet$foto());
        builder.addString(columnInfo.regIdColKey, realmObjectSource.realmGet$regId());
        builder.addString(columnInfo.driverJobColKey, realmObjectSource.realmGet$driverJob());
        builder.addString(columnInfo.distanceColKey, realmObjectSource.realmGet$distance());
        builder.addString(columnInfo.merekColKey, realmObjectSource.realmGet$merek());
        builder.addString(columnInfo.nomor_kendaraanColKey, realmObjectSource.realmGet$nomor_kendaraan());
        builder.addString(columnInfo.warnaColKey, realmObjectSource.realmGet$warna());
        builder.addString(columnInfo.tipeColKey, realmObjectSource.realmGet$tipe());
        builder.addString(columnInfo.bearingColKey, realmObjectSource.realmGet$bearing());
        builder.addString(columnInfo.ratingColKey, realmObjectSource.realmGet$rating());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_DriverModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.DriverModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DriverModel.class);
        long tableNativePtr = table.getNativePtr();
        DriverModelColumnInfo columnInfo = (DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        }
        String realmGet$namaDriver = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$namaDriver();
        if (realmGet$namaDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaDriverColKey, colKey, realmGet$namaDriver, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$longitude(), false);
        java.util.Date realmGet$updateAt = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$updateAt();
        if (realmGet$updateAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.updateAtColKey, colKey, realmGet$updateAt.getTime(), false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        }
        String realmGet$foto = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$foto();
        if (realmGet$foto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fotoColKey, colKey, realmGet$foto, false);
        }
        String realmGet$regId = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$regId();
        if (realmGet$regId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.regIdColKey, colKey, realmGet$regId, false);
        }
        String realmGet$driverJob = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$driverJob();
        if (realmGet$driverJob != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.driverJobColKey, colKey, realmGet$driverJob, false);
        }
        String realmGet$distance = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$distance();
        if (realmGet$distance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
        }
        String realmGet$merek = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$merek();
        if (realmGet$merek != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merekColKey, colKey, realmGet$merek, false);
        }
        String realmGet$nomor_kendaraan = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$nomor_kendaraan();
        if (realmGet$nomor_kendaraan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, realmGet$nomor_kendaraan, false);
        }
        String realmGet$warna = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$warna();
        if (realmGet$warna != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.warnaColKey, colKey, realmGet$warna, false);
        }
        String realmGet$tipe = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$tipe();
        if (realmGet$tipe != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tipeColKey, colKey, realmGet$tipe, false);
        }
        String realmGet$bearing = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$bearing();
        if (realmGet$bearing != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bearingColKey, colKey, realmGet$bearing, false);
        }
        String realmGet$rating = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DriverModel.class);
        long tableNativePtr = table.getNativePtr();
        DriverModelColumnInfo columnInfo = (DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class);
        com.ourdevelops.ourjek.models.DriverModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.DriverModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            }
            String realmGet$namaDriver = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$namaDriver();
            if (realmGet$namaDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaDriverColKey, colKey, realmGet$namaDriver, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$longitude(), false);
            java.util.Date realmGet$updateAt = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$updateAt();
            if (realmGet$updateAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.updateAtColKey, colKey, realmGet$updateAt.getTime(), false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            }
            String realmGet$foto = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$foto();
            if (realmGet$foto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fotoColKey, colKey, realmGet$foto, false);
            }
            String realmGet$regId = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$regId();
            if (realmGet$regId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.regIdColKey, colKey, realmGet$regId, false);
            }
            String realmGet$driverJob = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$driverJob();
            if (realmGet$driverJob != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.driverJobColKey, colKey, realmGet$driverJob, false);
            }
            String realmGet$distance = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$distance();
            if (realmGet$distance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
            }
            String realmGet$merek = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$merek();
            if (realmGet$merek != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merekColKey, colKey, realmGet$merek, false);
            }
            String realmGet$nomor_kendaraan = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$nomor_kendaraan();
            if (realmGet$nomor_kendaraan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, realmGet$nomor_kendaraan, false);
            }
            String realmGet$warna = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$warna();
            if (realmGet$warna != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.warnaColKey, colKey, realmGet$warna, false);
            }
            String realmGet$tipe = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$tipe();
            if (realmGet$tipe != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tipeColKey, colKey, realmGet$tipe, false);
            }
            String realmGet$bearing = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$bearing();
            if (realmGet$bearing != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bearingColKey, colKey, realmGet$bearing, false);
            }
            String realmGet$rating = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.DriverModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DriverModel.class);
        long tableNativePtr = table.getNativePtr();
        DriverModelColumnInfo columnInfo = (DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
        }
        String realmGet$namaDriver = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$namaDriver();
        if (realmGet$namaDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaDriverColKey, colKey, realmGet$namaDriver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaDriverColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$longitude(), false);
        java.util.Date realmGet$updateAt = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$updateAt();
        if (realmGet$updateAt != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.updateAtColKey, colKey, realmGet$updateAt.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updateAtColKey, colKey, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
        }
        String realmGet$foto = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$foto();
        if (realmGet$foto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fotoColKey, colKey, realmGet$foto, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fotoColKey, colKey, false);
        }
        String realmGet$regId = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$regId();
        if (realmGet$regId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.regIdColKey, colKey, realmGet$regId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.regIdColKey, colKey, false);
        }
        String realmGet$driverJob = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$driverJob();
        if (realmGet$driverJob != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.driverJobColKey, colKey, realmGet$driverJob, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.driverJobColKey, colKey, false);
        }
        String realmGet$distance = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$distance();
        if (realmGet$distance != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.distanceColKey, colKey, false);
        }
        String realmGet$merek = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$merek();
        if (realmGet$merek != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.merekColKey, colKey, realmGet$merek, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.merekColKey, colKey, false);
        }
        String realmGet$nomor_kendaraan = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$nomor_kendaraan();
        if (realmGet$nomor_kendaraan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, realmGet$nomor_kendaraan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, false);
        }
        String realmGet$warna = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$warna();
        if (realmGet$warna != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.warnaColKey, colKey, realmGet$warna, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.warnaColKey, colKey, false);
        }
        String realmGet$tipe = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$tipe();
        if (realmGet$tipe != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tipeColKey, colKey, realmGet$tipe, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tipeColKey, colKey, false);
        }
        String realmGet$bearing = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$bearing();
        if (realmGet$bearing != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bearingColKey, colKey, realmGet$bearing, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bearingColKey, colKey, false);
        }
        String realmGet$rating = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ratingColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.DriverModel.class);
        long tableNativePtr = table.getNativePtr();
        DriverModelColumnInfo columnInfo = (DriverModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.DriverModel.class);
        com.ourdevelops.ourjek.models.DriverModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.DriverModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
            }
            String realmGet$namaDriver = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$namaDriver();
            if (realmGet$namaDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaDriverColKey, colKey, realmGet$namaDriver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaDriverColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, colKey, ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$longitude(), false);
            java.util.Date realmGet$updateAt = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$updateAt();
            if (realmGet$updateAt != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.updateAtColKey, colKey, realmGet$updateAt.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.updateAtColKey, colKey, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
            }
            String realmGet$foto = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$foto();
            if (realmGet$foto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fotoColKey, colKey, realmGet$foto, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fotoColKey, colKey, false);
            }
            String realmGet$regId = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$regId();
            if (realmGet$regId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.regIdColKey, colKey, realmGet$regId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.regIdColKey, colKey, false);
            }
            String realmGet$driverJob = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$driverJob();
            if (realmGet$driverJob != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.driverJobColKey, colKey, realmGet$driverJob, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.driverJobColKey, colKey, false);
            }
            String realmGet$distance = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$distance();
            if (realmGet$distance != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.distanceColKey, colKey, realmGet$distance, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.distanceColKey, colKey, false);
            }
            String realmGet$merek = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$merek();
            if (realmGet$merek != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.merekColKey, colKey, realmGet$merek, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.merekColKey, colKey, false);
            }
            String realmGet$nomor_kendaraan = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$nomor_kendaraan();
            if (realmGet$nomor_kendaraan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, realmGet$nomor_kendaraan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nomor_kendaraanColKey, colKey, false);
            }
            String realmGet$warna = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$warna();
            if (realmGet$warna != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.warnaColKey, colKey, realmGet$warna, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.warnaColKey, colKey, false);
            }
            String realmGet$tipe = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$tipe();
            if (realmGet$tipe != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tipeColKey, colKey, realmGet$tipe, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tipeColKey, colKey, false);
            }
            String realmGet$bearing = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$bearing();
            if (realmGet$bearing != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bearingColKey, colKey, realmGet$bearing, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bearingColKey, colKey, false);
            }
            String realmGet$rating = ((com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) object).realmGet$rating();
            if (realmGet$rating != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingColKey, colKey, realmGet$rating, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ratingColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.DriverModel createDetachedCopy(com.ourdevelops.ourjek.models.DriverModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.DriverModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.DriverModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.DriverModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.DriverModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_DriverModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$namaDriver(realmSource.realmGet$namaDriver());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());
        unmanagedCopy.realmSet$updateAt(realmSource.realmGet$updateAt());
        unmanagedCopy.realmSet$noTelepon(realmSource.realmGet$noTelepon());
        unmanagedCopy.realmSet$foto(realmSource.realmGet$foto());
        unmanagedCopy.realmSet$regId(realmSource.realmGet$regId());
        unmanagedCopy.realmSet$driverJob(realmSource.realmGet$driverJob());
        unmanagedCopy.realmSet$distance(realmSource.realmGet$distance());
        unmanagedCopy.realmSet$merek(realmSource.realmGet$merek());
        unmanagedCopy.realmSet$nomor_kendaraan(realmSource.realmGet$nomor_kendaraan());
        unmanagedCopy.realmSet$warna(realmSource.realmGet$warna());
        unmanagedCopy.realmSet$tipe(realmSource.realmGet$tipe());
        unmanagedCopy.realmSet$bearing(realmSource.realmGet$bearing());
        unmanagedCopy.realmSet$rating(realmSource.realmGet$rating());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("DriverModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaDriver:");
        stringBuilder.append(realmGet$namaDriver() != null ? realmGet$namaDriver() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latitude:");
        stringBuilder.append(realmGet$latitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{longitude:");
        stringBuilder.append(realmGet$longitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{updateAt:");
        stringBuilder.append(realmGet$updateAt() != null ? realmGet$updateAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{noTelepon:");
        stringBuilder.append(realmGet$noTelepon() != null ? realmGet$noTelepon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{foto:");
        stringBuilder.append(realmGet$foto() != null ? realmGet$foto() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{regId:");
        stringBuilder.append(realmGet$regId() != null ? realmGet$regId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{driverJob:");
        stringBuilder.append(realmGet$driverJob() != null ? realmGet$driverJob() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{distance:");
        stringBuilder.append(realmGet$distance() != null ? realmGet$distance() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{merek:");
        stringBuilder.append(realmGet$merek() != null ? realmGet$merek() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nomor_kendaraan:");
        stringBuilder.append(realmGet$nomor_kendaraan() != null ? realmGet$nomor_kendaraan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{warna:");
        stringBuilder.append(realmGet$warna() != null ? realmGet$warna() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tipe:");
        stringBuilder.append(realmGet$tipe() != null ? realmGet$tipe() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bearing:");
        stringBuilder.append(realmGet$bearing() != null ? realmGet$bearing() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rating:");
        stringBuilder.append(realmGet$rating() != null ? realmGet$rating() : "null");
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
        com_ourdevelops_ourjek_models_DriverModelRealmProxy aDriverModel = (com_ourdevelops_ourjek_models_DriverModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aDriverModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDriverModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aDriverModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
