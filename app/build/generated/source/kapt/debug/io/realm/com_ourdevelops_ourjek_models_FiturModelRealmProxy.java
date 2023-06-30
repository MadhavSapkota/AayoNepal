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
public class com_ourdevelops_ourjek_models_FiturModelRealmProxy extends com.ourdevelops.ourjek.models.FiturModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface {

    static final class FiturModelColumnInfo extends ColumnInfo {
        long idFiturColKey;
        long fiturColKey;
        long biayaColKey;
        long biaya_minimumColKey;
        long keteranganBiayaColKey;
        long keteranganColKey;
        long diskonColKey;
        long biayaAkhirColKey;
        long iconColKey;
        long icon_driverColKey;
        long homeColKey;
        long maksimumdistColKey;
        long vehicle_category_idColKey;
        long minimum_fareColKey;

        FiturModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(14);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FiturModel");
            this.idFiturColKey = addColumnDetails("idFitur", "idFitur", objectSchemaInfo);
            this.fiturColKey = addColumnDetails("fitur", "fitur", objectSchemaInfo);
            this.biayaColKey = addColumnDetails("biaya", "biaya", objectSchemaInfo);
            this.biaya_minimumColKey = addColumnDetails("biaya_minimum", "biaya_minimum", objectSchemaInfo);
            this.keteranganBiayaColKey = addColumnDetails("keteranganBiaya", "keteranganBiaya", objectSchemaInfo);
            this.keteranganColKey = addColumnDetails("keterangan", "keterangan", objectSchemaInfo);
            this.diskonColKey = addColumnDetails("diskon", "diskon", objectSchemaInfo);
            this.biayaAkhirColKey = addColumnDetails("biayaAkhir", "biayaAkhir", objectSchemaInfo);
            this.iconColKey = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.icon_driverColKey = addColumnDetails("icon_driver", "icon_driver", objectSchemaInfo);
            this.homeColKey = addColumnDetails("home", "home", objectSchemaInfo);
            this.maksimumdistColKey = addColumnDetails("maksimumdist", "maksimumdist", objectSchemaInfo);
            this.vehicle_category_idColKey = addColumnDetails("vehicle_category_id", "vehicle_category_id", objectSchemaInfo);
            this.minimum_fareColKey = addColumnDetails("minimum_fare", "minimum_fare", objectSchemaInfo);
        }

        FiturModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FiturModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FiturModelColumnInfo src = (FiturModelColumnInfo) rawSrc;
            final FiturModelColumnInfo dst = (FiturModelColumnInfo) rawDst;
            dst.idFiturColKey = src.idFiturColKey;
            dst.fiturColKey = src.fiturColKey;
            dst.biayaColKey = src.biayaColKey;
            dst.biaya_minimumColKey = src.biaya_minimumColKey;
            dst.keteranganBiayaColKey = src.keteranganBiayaColKey;
            dst.keteranganColKey = src.keteranganColKey;
            dst.diskonColKey = src.diskonColKey;
            dst.biayaAkhirColKey = src.biayaAkhirColKey;
            dst.iconColKey = src.iconColKey;
            dst.icon_driverColKey = src.icon_driverColKey;
            dst.homeColKey = src.homeColKey;
            dst.maksimumdistColKey = src.maksimumdistColKey;
            dst.vehicle_category_idColKey = src.vehicle_category_idColKey;
            dst.minimum_fareColKey = src.minimum_fareColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FiturModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.FiturModel> proxyState;

    com_ourdevelops_ourjek_models_FiturModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FiturModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.FiturModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idFitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idFiturColKey);
    }

    @Override
    public void realmSet$idFitur(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'idFitur' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fiturColKey);
    }

    @Override
    public void realmSet$fitur(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fiturColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fiturColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fiturColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fiturColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$biaya() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.biayaColKey);
    }

    @Override
    public void realmSet$biaya(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.biayaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.biayaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$biaya_minimum() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.biaya_minimumColKey);
    }

    @Override
    public void realmSet$biaya_minimum(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.biaya_minimumColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.biaya_minimumColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$keteranganBiaya() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.keteranganBiayaColKey);
    }

    @Override
    public void realmSet$keteranganBiaya(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.keteranganBiayaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.keteranganBiayaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.keteranganBiayaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.keteranganBiayaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$keterangan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.keteranganColKey);
    }

    @Override
    public void realmSet$keterangan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.keteranganColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.keteranganColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.keteranganColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.keteranganColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$diskon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.diskonColKey);
    }

    @Override
    public void realmSet$diskon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.diskonColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.diskonColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.diskonColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.diskonColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$biayaAkhir() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.biayaAkhirColKey);
    }

    @Override
    public void realmSet$biayaAkhir(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.biayaAkhirColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.biayaAkhirColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$icon() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.iconColKey);
    }

    @Override
    public void realmSet$icon(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.iconColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.iconColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.iconColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.iconColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$icon_driver() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.icon_driverColKey);
    }

    @Override
    public void realmSet$icon_driver(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.icon_driverColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.icon_driverColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.icon_driverColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.icon_driverColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$home() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.homeColKey);
    }

    @Override
    public void realmSet$home(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.homeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.homeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.homeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.homeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$maksimumdist() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.maksimumdistColKey);
    }

    @Override
    public void realmSet$maksimumdist(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.maksimumdistColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.maksimumdistColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.maksimumdistColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.maksimumdistColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicle_category_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicle_category_idColKey);
    }

    @Override
    public void realmSet$vehicle_category_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicle_category_idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicle_category_idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicle_category_idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicle_category_idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$minimum_fare() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.minimum_fareColKey);
    }

    @Override
    public void realmSet$minimum_fare(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.minimum_fareColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.minimum_fareColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.minimum_fareColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.minimum_fareColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("FiturModel", 14, 0);
        builder.addPersistedProperty("idFitur", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("fitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("biaya", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("biaya_minimum", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("keteranganBiaya", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("keterangan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("diskon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("biayaAkhir", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("icon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("icon_driver", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("home", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("maksimumdist", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vehicle_category_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("minimum_fare", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FiturModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FiturModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FiturModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FiturModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.FiturModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.FiturModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
            FiturModelColumnInfo columnInfo = (FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
            long pkColumnKey = columnInfo.idFiturColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("idFitur")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("idFitur"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("idFitur")) {
                if (json.isNull("idFitur")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.FiturModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.FiturModel.class, json.getInt("idFitur"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idFitur'.");
            }
        }

        final com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) obj;
        if (json.has("fitur")) {
            if (json.isNull("fitur")) {
                objProxy.realmSet$fitur(null);
            } else {
                objProxy.realmSet$fitur((String) json.getString("fitur"));
            }
        }
        if (json.has("biaya")) {
            if (json.isNull("biaya")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'biaya' to null.");
            } else {
                objProxy.realmSet$biaya((long) json.getLong("biaya"));
            }
        }
        if (json.has("biaya_minimum")) {
            if (json.isNull("biaya_minimum")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'biaya_minimum' to null.");
            } else {
                objProxy.realmSet$biaya_minimum((long) json.getLong("biaya_minimum"));
            }
        }
        if (json.has("keteranganBiaya")) {
            if (json.isNull("keteranganBiaya")) {
                objProxy.realmSet$keteranganBiaya(null);
            } else {
                objProxy.realmSet$keteranganBiaya((String) json.getString("keteranganBiaya"));
            }
        }
        if (json.has("keterangan")) {
            if (json.isNull("keterangan")) {
                objProxy.realmSet$keterangan(null);
            } else {
                objProxy.realmSet$keterangan((String) json.getString("keterangan"));
            }
        }
        if (json.has("diskon")) {
            if (json.isNull("diskon")) {
                objProxy.realmSet$diskon(null);
            } else {
                objProxy.realmSet$diskon((String) json.getString("diskon"));
            }
        }
        if (json.has("biayaAkhir")) {
            if (json.isNull("biayaAkhir")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'biayaAkhir' to null.");
            } else {
                objProxy.realmSet$biayaAkhir((double) json.getDouble("biayaAkhir"));
            }
        }
        if (json.has("icon")) {
            if (json.isNull("icon")) {
                objProxy.realmSet$icon(null);
            } else {
                objProxy.realmSet$icon((String) json.getString("icon"));
            }
        }
        if (json.has("icon_driver")) {
            if (json.isNull("icon_driver")) {
                objProxy.realmSet$icon_driver(null);
            } else {
                objProxy.realmSet$icon_driver((String) json.getString("icon_driver"));
            }
        }
        if (json.has("home")) {
            if (json.isNull("home")) {
                objProxy.realmSet$home(null);
            } else {
                objProxy.realmSet$home((String) json.getString("home"));
            }
        }
        if (json.has("maksimumdist")) {
            if (json.isNull("maksimumdist")) {
                objProxy.realmSet$maksimumdist(null);
            } else {
                objProxy.realmSet$maksimumdist((String) json.getString("maksimumdist"));
            }
        }
        if (json.has("vehicle_category_id")) {
            if (json.isNull("vehicle_category_id")) {
                objProxy.realmSet$vehicle_category_id(null);
            } else {
                objProxy.realmSet$vehicle_category_id((String) json.getString("vehicle_category_id"));
            }
        }
        if (json.has("minimum_fare")) {
            if (json.isNull("minimum_fare")) {
                objProxy.realmSet$minimum_fare(null);
            } else {
                objProxy.realmSet$minimum_fare((String) json.getString("minimum_fare"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.FiturModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.FiturModel obj = new com.ourdevelops.ourjek.models.FiturModel();
        final com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("idFitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idFitur((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idFitur' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("fitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fitur(null);
                }
            } else if (name.equals("biaya")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biaya((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'biaya' to null.");
                }
            } else if (name.equals("biaya_minimum")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biaya_minimum((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'biaya_minimum' to null.");
                }
            } else if (name.equals("keteranganBiaya")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$keteranganBiaya((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$keteranganBiaya(null);
                }
            } else if (name.equals("keterangan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$keterangan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$keterangan(null);
                }
            } else if (name.equals("diskon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$diskon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$diskon(null);
                }
            } else if (name.equals("biayaAkhir")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biayaAkhir((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'biayaAkhir' to null.");
                }
            } else if (name.equals("icon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon(null);
                }
            } else if (name.equals("icon_driver")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon_driver((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon_driver(null);
                }
            } else if (name.equals("home")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$home((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$home(null);
                }
            } else if (name.equals("maksimumdist")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$maksimumdist((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$maksimumdist(null);
                }
            } else if (name.equals("vehicle_category_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_category_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicle_category_id(null);
                }
            } else if (name.equals("minimum_fare")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$minimum_fare((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$minimum_fare(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'idFitur'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_FiturModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.FiturModel copyOrUpdate(Realm realm, FiturModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.FiturModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.FiturModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.FiturModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
            long pkColumnKey = columnInfo.idFiturColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.FiturModel copy(Realm realm, FiturModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.FiturModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.FiturModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idFiturColKey, realmObjectSource.realmGet$idFitur());
        builder.addString(columnInfo.fiturColKey, realmObjectSource.realmGet$fitur());
        builder.addInteger(columnInfo.biayaColKey, realmObjectSource.realmGet$biaya());
        builder.addInteger(columnInfo.biaya_minimumColKey, realmObjectSource.realmGet$biaya_minimum());
        builder.addString(columnInfo.keteranganBiayaColKey, realmObjectSource.realmGet$keteranganBiaya());
        builder.addString(columnInfo.keteranganColKey, realmObjectSource.realmGet$keterangan());
        builder.addString(columnInfo.diskonColKey, realmObjectSource.realmGet$diskon());
        builder.addDouble(columnInfo.biayaAkhirColKey, realmObjectSource.realmGet$biayaAkhir());
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addString(columnInfo.icon_driverColKey, realmObjectSource.realmGet$icon_driver());
        builder.addString(columnInfo.homeColKey, realmObjectSource.realmGet$home());
        builder.addString(columnInfo.maksimumdistColKey, realmObjectSource.realmGet$maksimumdist());
        builder.addString(columnInfo.vehicle_category_idColKey, realmObjectSource.realmGet$vehicle_category_id());
        builder.addString(columnInfo.minimum_fareColKey, realmObjectSource.realmGet$minimum_fare());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_FiturModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.FiturModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        long tableNativePtr = table.getNativePtr();
        FiturModelColumnInfo columnInfo = (FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$fitur = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$fitur();
        if (realmGet$fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.biayaColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.biaya_minimumColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya_minimum(), false);
        String realmGet$keteranganBiaya = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keteranganBiaya();
        if (realmGet$keteranganBiaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, realmGet$keteranganBiaya, false);
        }
        String realmGet$keterangan = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keterangan();
        if (realmGet$keterangan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keteranganColKey, colKey, realmGet$keterangan, false);
        }
        String realmGet$diskon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$diskon();
        if (realmGet$diskon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biayaAkhir(), false);
        String realmGet$icon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        }
        String realmGet$icon_driver = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon_driver();
        if (realmGet$icon_driver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.icon_driverColKey, colKey, realmGet$icon_driver, false);
        }
        String realmGet$home = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$home();
        if (realmGet$home != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.homeColKey, colKey, realmGet$home, false);
        }
        String realmGet$maksimumdist = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$maksimumdist();
        if (realmGet$maksimumdist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maksimumdistColKey, colKey, realmGet$maksimumdist, false);
        }
        String realmGet$vehicle_category_id = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$vehicle_category_id();
        if (realmGet$vehicle_category_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, realmGet$vehicle_category_id, false);
        }
        String realmGet$minimum_fare = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$minimum_fare();
        if (realmGet$minimum_fare != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.minimum_fareColKey, colKey, realmGet$minimum_fare, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        long tableNativePtr = table.getNativePtr();
        FiturModelColumnInfo columnInfo = (FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        com.ourdevelops.ourjek.models.FiturModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.FiturModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$fitur = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$fitur();
            if (realmGet$fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.biayaColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.biaya_minimumColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya_minimum(), false);
            String realmGet$keteranganBiaya = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keteranganBiaya();
            if (realmGet$keteranganBiaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, realmGet$keteranganBiaya, false);
            }
            String realmGet$keterangan = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keterangan();
            if (realmGet$keterangan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keteranganColKey, colKey, realmGet$keterangan, false);
            }
            String realmGet$diskon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$diskon();
            if (realmGet$diskon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biayaAkhir(), false);
            String realmGet$icon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            }
            String realmGet$icon_driver = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon_driver();
            if (realmGet$icon_driver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.icon_driverColKey, colKey, realmGet$icon_driver, false);
            }
            String realmGet$home = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$home();
            if (realmGet$home != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.homeColKey, colKey, realmGet$home, false);
            }
            String realmGet$maksimumdist = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$maksimumdist();
            if (realmGet$maksimumdist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maksimumdistColKey, colKey, realmGet$maksimumdist, false);
            }
            String realmGet$vehicle_category_id = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$vehicle_category_id();
            if (realmGet$vehicle_category_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, realmGet$vehicle_category_id, false);
            }
            String realmGet$minimum_fare = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$minimum_fare();
            if (realmGet$minimum_fare != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.minimum_fareColKey, colKey, realmGet$minimum_fare, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.FiturModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        long tableNativePtr = table.getNativePtr();
        FiturModelColumnInfo columnInfo = (FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
        }
        cache.put(object, colKey);
        String realmGet$fitur = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$fitur();
        if (realmGet$fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fiturColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.biayaColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.biaya_minimumColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya_minimum(), false);
        String realmGet$keteranganBiaya = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keteranganBiaya();
        if (realmGet$keteranganBiaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, realmGet$keteranganBiaya, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, false);
        }
        String realmGet$keterangan = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keterangan();
        if (realmGet$keterangan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keteranganColKey, colKey, realmGet$keterangan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keteranganColKey, colKey, false);
        }
        String realmGet$diskon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$diskon();
        if (realmGet$diskon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.diskonColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biayaAkhir(), false);
        String realmGet$icon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
        }
        String realmGet$icon_driver = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon_driver();
        if (realmGet$icon_driver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.icon_driverColKey, colKey, realmGet$icon_driver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.icon_driverColKey, colKey, false);
        }
        String realmGet$home = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$home();
        if (realmGet$home != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.homeColKey, colKey, realmGet$home, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.homeColKey, colKey, false);
        }
        String realmGet$maksimumdist = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$maksimumdist();
        if (realmGet$maksimumdist != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.maksimumdistColKey, colKey, realmGet$maksimumdist, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.maksimumdistColKey, colKey, false);
        }
        String realmGet$vehicle_category_id = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$vehicle_category_id();
        if (realmGet$vehicle_category_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, realmGet$vehicle_category_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, false);
        }
        String realmGet$minimum_fare = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$minimum_fare();
        if (realmGet$minimum_fare != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.minimum_fareColKey, colKey, realmGet$minimum_fare, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.minimum_fareColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        long tableNativePtr = table.getNativePtr();
        FiturModelColumnInfo columnInfo = (FiturModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.FiturModel.class);
        long pkColumnKey = columnInfo.idFiturColKey;
        com.ourdevelops.ourjek.models.FiturModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.FiturModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$idFitur());
            }
            cache.put(object, colKey);
            String realmGet$fitur = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$fitur();
            if (realmGet$fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fiturColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.biayaColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.biaya_minimumColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biaya_minimum(), false);
            String realmGet$keteranganBiaya = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keteranganBiaya();
            if (realmGet$keteranganBiaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, realmGet$keteranganBiaya, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.keteranganBiayaColKey, colKey, false);
            }
            String realmGet$keterangan = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$keterangan();
            if (realmGet$keterangan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.keteranganColKey, colKey, realmGet$keterangan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.keteranganColKey, colKey, false);
            }
            String realmGet$diskon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$diskon();
            if (realmGet$diskon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diskonColKey, colKey, realmGet$diskon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.diskonColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.biayaAkhirColKey, colKey, ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$biayaAkhir(), false);
            String realmGet$icon = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
            }
            String realmGet$icon_driver = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$icon_driver();
            if (realmGet$icon_driver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.icon_driverColKey, colKey, realmGet$icon_driver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.icon_driverColKey, colKey, false);
            }
            String realmGet$home = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$home();
            if (realmGet$home != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.homeColKey, colKey, realmGet$home, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.homeColKey, colKey, false);
            }
            String realmGet$maksimumdist = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$maksimumdist();
            if (realmGet$maksimumdist != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.maksimumdistColKey, colKey, realmGet$maksimumdist, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.maksimumdistColKey, colKey, false);
            }
            String realmGet$vehicle_category_id = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$vehicle_category_id();
            if (realmGet$vehicle_category_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, realmGet$vehicle_category_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_category_idColKey, colKey, false);
            }
            String realmGet$minimum_fare = ((com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) object).realmGet$minimum_fare();
            if (realmGet$minimum_fare != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.minimum_fareColKey, colKey, realmGet$minimum_fare, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.minimum_fareColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.FiturModel createDetachedCopy(com.ourdevelops.ourjek.models.FiturModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.FiturModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.FiturModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.FiturModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.FiturModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$idFitur(realmSource.realmGet$idFitur());
        unmanagedCopy.realmSet$fitur(realmSource.realmGet$fitur());
        unmanagedCopy.realmSet$biaya(realmSource.realmGet$biaya());
        unmanagedCopy.realmSet$biaya_minimum(realmSource.realmGet$biaya_minimum());
        unmanagedCopy.realmSet$keteranganBiaya(realmSource.realmGet$keteranganBiaya());
        unmanagedCopy.realmSet$keterangan(realmSource.realmGet$keterangan());
        unmanagedCopy.realmSet$diskon(realmSource.realmGet$diskon());
        unmanagedCopy.realmSet$biayaAkhir(realmSource.realmGet$biayaAkhir());
        unmanagedCopy.realmSet$icon(realmSource.realmGet$icon());
        unmanagedCopy.realmSet$icon_driver(realmSource.realmGet$icon_driver());
        unmanagedCopy.realmSet$home(realmSource.realmGet$home());
        unmanagedCopy.realmSet$maksimumdist(realmSource.realmGet$maksimumdist());
        unmanagedCopy.realmSet$vehicle_category_id(realmSource.realmGet$vehicle_category_id());
        unmanagedCopy.realmSet$minimum_fare(realmSource.realmGet$minimum_fare());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.FiturModel update(Realm realm, FiturModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.FiturModel realmObject, com.ourdevelops.ourjek.models.FiturModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_FiturModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.FiturModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idFiturColKey, realmObjectSource.realmGet$idFitur());
        builder.addString(columnInfo.fiturColKey, realmObjectSource.realmGet$fitur());
        builder.addInteger(columnInfo.biayaColKey, realmObjectSource.realmGet$biaya());
        builder.addInteger(columnInfo.biaya_minimumColKey, realmObjectSource.realmGet$biaya_minimum());
        builder.addString(columnInfo.keteranganBiayaColKey, realmObjectSource.realmGet$keteranganBiaya());
        builder.addString(columnInfo.keteranganColKey, realmObjectSource.realmGet$keterangan());
        builder.addString(columnInfo.diskonColKey, realmObjectSource.realmGet$diskon());
        builder.addDouble(columnInfo.biayaAkhirColKey, realmObjectSource.realmGet$biayaAkhir());
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addString(columnInfo.icon_driverColKey, realmObjectSource.realmGet$icon_driver());
        builder.addString(columnInfo.homeColKey, realmObjectSource.realmGet$home());
        builder.addString(columnInfo.maksimumdistColKey, realmObjectSource.realmGet$maksimumdist());
        builder.addString(columnInfo.vehicle_category_idColKey, realmObjectSource.realmGet$vehicle_category_id());
        builder.addString(columnInfo.minimum_fareColKey, realmObjectSource.realmGet$minimum_fare());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("FiturModel = proxy[");
        stringBuilder.append("{idFitur:");
        stringBuilder.append(realmGet$idFitur());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fitur:");
        stringBuilder.append(realmGet$fitur() != null ? realmGet$fitur() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{biaya:");
        stringBuilder.append(realmGet$biaya());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{biaya_minimum:");
        stringBuilder.append(realmGet$biaya_minimum());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keteranganBiaya:");
        stringBuilder.append(realmGet$keteranganBiaya() != null ? realmGet$keteranganBiaya() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keterangan:");
        stringBuilder.append(realmGet$keterangan() != null ? realmGet$keterangan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{diskon:");
        stringBuilder.append(realmGet$diskon() != null ? realmGet$diskon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{biayaAkhir:");
        stringBuilder.append(realmGet$biayaAkhir());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{icon:");
        stringBuilder.append(realmGet$icon() != null ? realmGet$icon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{icon_driver:");
        stringBuilder.append(realmGet$icon_driver() != null ? realmGet$icon_driver() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{home:");
        stringBuilder.append(realmGet$home() != null ? realmGet$home() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{maksimumdist:");
        stringBuilder.append(realmGet$maksimumdist() != null ? realmGet$maksimumdist() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_category_id:");
        stringBuilder.append(realmGet$vehicle_category_id() != null ? realmGet$vehicle_category_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{minimum_fare:");
        stringBuilder.append(realmGet$minimum_fare() != null ? realmGet$minimum_fare() : "null");
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
        com_ourdevelops_ourjek_models_FiturModelRealmProxy aFiturModel = (com_ourdevelops_ourjek_models_FiturModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aFiturModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFiturModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aFiturModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
