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
public class com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy extends com.ourdevelops.ourjek.models.TransaksiSendModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface {

    static final class TransaksiSendModelColumnInfo extends ColumnInfo {
        long idColKey;
        long idPelangganColKey;
        long idDriverColKey;
        long orderFiturColKey;
        long startLatitudeColKey;
        long startLongitudeColKey;
        long endLatitudeColKey;
        long endLongitudeColKey;
        long jarakColKey;
        long hargaColKey;
        long waktuOrderColKey;
        long waktuSelesaiColKey;
        long alamatAsalColKey;
        long alamatTujuanColKey;
        long kodePromoColKey;
        long kreditPromoColKey;
        long isPakaiWalletColKey;
        long rateColKey;
        long statusColKey;
        long estimasiColKey;
        long namaPengirimColKey;
        long teleponPengirimColKey;
        long namaPenerimaColKey;
        long teleponPenerimaColKey;
        long namaBarangColKey;
        long number_of_loadersColKey;
        long delivery_typeColKey;
        long estimated_weightColKey;
        long isRentalColKey;
        long remarksColKey;

        TransaksiSendModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(30);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TransaksiSendModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.idPelangganColKey = addColumnDetails("idPelanggan", "idPelanggan", objectSchemaInfo);
            this.idDriverColKey = addColumnDetails("idDriver", "idDriver", objectSchemaInfo);
            this.orderFiturColKey = addColumnDetails("orderFitur", "orderFitur", objectSchemaInfo);
            this.startLatitudeColKey = addColumnDetails("startLatitude", "startLatitude", objectSchemaInfo);
            this.startLongitudeColKey = addColumnDetails("startLongitude", "startLongitude", objectSchemaInfo);
            this.endLatitudeColKey = addColumnDetails("endLatitude", "endLatitude", objectSchemaInfo);
            this.endLongitudeColKey = addColumnDetails("endLongitude", "endLongitude", objectSchemaInfo);
            this.jarakColKey = addColumnDetails("jarak", "jarak", objectSchemaInfo);
            this.hargaColKey = addColumnDetails("harga", "harga", objectSchemaInfo);
            this.waktuOrderColKey = addColumnDetails("waktuOrder", "waktuOrder", objectSchemaInfo);
            this.waktuSelesaiColKey = addColumnDetails("waktuSelesai", "waktuSelesai", objectSchemaInfo);
            this.alamatAsalColKey = addColumnDetails("alamatAsal", "alamatAsal", objectSchemaInfo);
            this.alamatTujuanColKey = addColumnDetails("alamatTujuan", "alamatTujuan", objectSchemaInfo);
            this.kodePromoColKey = addColumnDetails("kodePromo", "kodePromo", objectSchemaInfo);
            this.kreditPromoColKey = addColumnDetails("kreditPromo", "kreditPromo", objectSchemaInfo);
            this.isPakaiWalletColKey = addColumnDetails("isPakaiWallet", "isPakaiWallet", objectSchemaInfo);
            this.rateColKey = addColumnDetails("rate", "rate", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
            this.estimasiColKey = addColumnDetails("estimasi", "estimasi", objectSchemaInfo);
            this.namaPengirimColKey = addColumnDetails("namaPengirim", "namaPengirim", objectSchemaInfo);
            this.teleponPengirimColKey = addColumnDetails("teleponPengirim", "teleponPengirim", objectSchemaInfo);
            this.namaPenerimaColKey = addColumnDetails("namaPenerima", "namaPenerima", objectSchemaInfo);
            this.teleponPenerimaColKey = addColumnDetails("teleponPenerima", "teleponPenerima", objectSchemaInfo);
            this.namaBarangColKey = addColumnDetails("namaBarang", "namaBarang", objectSchemaInfo);
            this.number_of_loadersColKey = addColumnDetails("number_of_loaders", "number_of_loaders", objectSchemaInfo);
            this.delivery_typeColKey = addColumnDetails("delivery_type", "delivery_type", objectSchemaInfo);
            this.estimated_weightColKey = addColumnDetails("estimated_weight", "estimated_weight", objectSchemaInfo);
            this.isRentalColKey = addColumnDetails("isRental", "isRental", objectSchemaInfo);
            this.remarksColKey = addColumnDetails("remarks", "remarks", objectSchemaInfo);
        }

        TransaksiSendModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TransaksiSendModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TransaksiSendModelColumnInfo src = (TransaksiSendModelColumnInfo) rawSrc;
            final TransaksiSendModelColumnInfo dst = (TransaksiSendModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.idPelangganColKey = src.idPelangganColKey;
            dst.idDriverColKey = src.idDriverColKey;
            dst.orderFiturColKey = src.orderFiturColKey;
            dst.startLatitudeColKey = src.startLatitudeColKey;
            dst.startLongitudeColKey = src.startLongitudeColKey;
            dst.endLatitudeColKey = src.endLatitudeColKey;
            dst.endLongitudeColKey = src.endLongitudeColKey;
            dst.jarakColKey = src.jarakColKey;
            dst.hargaColKey = src.hargaColKey;
            dst.waktuOrderColKey = src.waktuOrderColKey;
            dst.waktuSelesaiColKey = src.waktuSelesaiColKey;
            dst.alamatAsalColKey = src.alamatAsalColKey;
            dst.alamatTujuanColKey = src.alamatTujuanColKey;
            dst.kodePromoColKey = src.kodePromoColKey;
            dst.kreditPromoColKey = src.kreditPromoColKey;
            dst.isPakaiWalletColKey = src.isPakaiWalletColKey;
            dst.rateColKey = src.rateColKey;
            dst.statusColKey = src.statusColKey;
            dst.estimasiColKey = src.estimasiColKey;
            dst.namaPengirimColKey = src.namaPengirimColKey;
            dst.teleponPengirimColKey = src.teleponPengirimColKey;
            dst.namaPenerimaColKey = src.namaPenerimaColKey;
            dst.teleponPenerimaColKey = src.teleponPenerimaColKey;
            dst.namaBarangColKey = src.namaBarangColKey;
            dst.number_of_loadersColKey = src.number_of_loadersColKey;
            dst.delivery_typeColKey = src.delivery_typeColKey;
            dst.estimated_weightColKey = src.estimated_weightColKey;
            dst.isRentalColKey = src.isRentalColKey;
            dst.remarksColKey = src.remarksColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TransaksiSendModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.TransaksiSendModel> proxyState;

    com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TransaksiSendModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.TransaksiSendModel>(this);
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idPelanggan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idPelangganColKey);
    }

    @Override
    public void realmSet$idPelanggan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idPelangganColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idPelangganColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idPelangganColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idPelangganColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idDriver() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idDriverColKey);
    }

    @Override
    public void realmSet$idDriver(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idDriverColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idDriverColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idDriverColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idDriverColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$orderFitur() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.orderFiturColKey);
    }

    @Override
    public void realmSet$orderFitur(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.orderFiturColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.orderFiturColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.orderFiturColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.orderFiturColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$startLatitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.startLatitudeColKey);
    }

    @Override
    public void realmSet$startLatitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.startLatitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.startLatitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$startLongitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.startLongitudeColKey);
    }

    @Override
    public void realmSet$startLongitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.startLongitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.startLongitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$endLatitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.endLatitudeColKey);
    }

    @Override
    public void realmSet$endLatitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.endLatitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.endLatitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$endLongitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.endLongitudeColKey);
    }

    @Override
    public void realmSet$endLongitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.endLongitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.endLongitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$jarak() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.jarakColKey);
    }

    @Override
    public void realmSet$jarak(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.jarakColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.jarakColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$harga() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.hargaColKey);
    }

    @Override
    public void realmSet$harga(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.hargaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.hargaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$waktuOrder() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.waktuOrderColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.waktuOrderColKey);
    }

    @Override
    public void realmSet$waktuOrder(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.waktuOrderColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.waktuOrderColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.waktuOrderColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.waktuOrderColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$waktuSelesai() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.waktuSelesaiColKey)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.waktuSelesaiColKey);
    }

    @Override
    public void realmSet$waktuSelesai(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.waktuSelesaiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setDate(columnInfo.waktuSelesaiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.waktuSelesaiColKey);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.waktuSelesaiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$alamatAsal() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.alamatAsalColKey);
    }

    @Override
    public void realmSet$alamatAsal(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.alamatAsalColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.alamatAsalColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.alamatAsalColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.alamatAsalColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$alamatTujuan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.alamatTujuanColKey);
    }

    @Override
    public void realmSet$alamatTujuan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.alamatTujuanColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.alamatTujuanColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.alamatTujuanColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.alamatTujuanColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kodePromo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kodePromoColKey);
    }

    @Override
    public void realmSet$kodePromo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kodePromoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kodePromoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kodePromoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kodePromoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$kreditPromo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.kreditPromoColKey);
    }

    @Override
    public void realmSet$kreditPromo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.kreditPromoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.kreditPromoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.kreditPromoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.kreditPromoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isPakaiWallet() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isPakaiWalletColKey);
    }

    @Override
    public void realmSet$isPakaiWallet(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isPakaiWalletColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isPakaiWalletColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$rate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.rateColKey);
    }

    @Override
    public void realmSet$rate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.rateColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.rateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.rateColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.rateColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.statusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$estimasi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.estimasiColKey);
    }

    @Override
    public void realmSet$estimasi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.estimasiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.estimasiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.estimasiColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.estimasiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaPengirim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaPengirimColKey);
    }

    @Override
    public void realmSet$namaPengirim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaPengirimColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaPengirimColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaPengirimColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaPengirimColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$teleponPengirim() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.teleponPengirimColKey);
    }

    @Override
    public void realmSet$teleponPengirim(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.teleponPengirimColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.teleponPengirimColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.teleponPengirimColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.teleponPengirimColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaPenerima() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaPenerimaColKey);
    }

    @Override
    public void realmSet$namaPenerima(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaPenerimaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaPenerimaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaPenerimaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaPenerimaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$teleponPenerima() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.teleponPenerimaColKey);
    }

    @Override
    public void realmSet$teleponPenerima(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.teleponPenerimaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.teleponPenerimaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.teleponPenerimaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.teleponPenerimaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$namaBarang() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.namaBarangColKey);
    }

    @Override
    public void realmSet$namaBarang(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.namaBarangColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.namaBarangColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.namaBarangColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.namaBarangColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$number_of_loaders() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.number_of_loadersColKey);
    }

    @Override
    public void realmSet$number_of_loaders(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.number_of_loadersColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.number_of_loadersColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.number_of_loadersColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.number_of_loadersColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$delivery_type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.delivery_typeColKey);
    }

    @Override
    public void realmSet$delivery_type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.delivery_typeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.delivery_typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.delivery_typeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.delivery_typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$estimated_weight() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.estimated_weightColKey);
    }

    @Override
    public void realmSet$estimated_weight(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.estimated_weightColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.estimated_weightColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.estimated_weightColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.estimated_weightColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$isRental() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.isRentalColKey)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isRentalColKey);
    }

    @Override
    public void realmSet$isRental(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.isRentalColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.isRentalColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.isRentalColKey);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.isRentalColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$remarks() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.remarksColKey);
    }

    @Override
    public void realmSet$remarks(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.remarksColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.remarksColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.remarksColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.remarksColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TransaksiSendModel", 30, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idPelanggan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idDriver", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("orderFitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("startLatitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("startLongitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("endLatitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("endLongitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("jarak", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("harga", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("waktuOrder", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("waktuSelesai", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("alamatAsal", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("alamatTujuan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kodePromo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("kreditPromo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isPakaiWallet", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("rate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("estimasi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaBarang", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("number_of_loaders", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delivery_type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("estimated_weight", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isRental", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("remarks", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TransaksiSendModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TransaksiSendModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TransaksiSendModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TransaksiSendModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.TransaksiSendModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.TransaksiSendModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
            TransaksiSendModelColumnInfo columnInfo = (TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (json.isNull("id")) {
                colKey = table.findFirstNull(pkColumnKey);
            } else {
                colKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.TransaksiSendModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.TransaksiSendModel.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) obj;
        if (json.has("idPelanggan")) {
            if (json.isNull("idPelanggan")) {
                objProxy.realmSet$idPelanggan(null);
            } else {
                objProxy.realmSet$idPelanggan((String) json.getString("idPelanggan"));
            }
        }
        if (json.has("idDriver")) {
            if (json.isNull("idDriver")) {
                objProxy.realmSet$idDriver(null);
            } else {
                objProxy.realmSet$idDriver((String) json.getString("idDriver"));
            }
        }
        if (json.has("orderFitur")) {
            if (json.isNull("orderFitur")) {
                objProxy.realmSet$orderFitur(null);
            } else {
                objProxy.realmSet$orderFitur((String) json.getString("orderFitur"));
            }
        }
        if (json.has("startLatitude")) {
            if (json.isNull("startLatitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startLatitude' to null.");
            } else {
                objProxy.realmSet$startLatitude((double) json.getDouble("startLatitude"));
            }
        }
        if (json.has("startLongitude")) {
            if (json.isNull("startLongitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startLongitude' to null.");
            } else {
                objProxy.realmSet$startLongitude((double) json.getDouble("startLongitude"));
            }
        }
        if (json.has("endLatitude")) {
            if (json.isNull("endLatitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endLatitude' to null.");
            } else {
                objProxy.realmSet$endLatitude((double) json.getDouble("endLatitude"));
            }
        }
        if (json.has("endLongitude")) {
            if (json.isNull("endLongitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endLongitude' to null.");
            } else {
                objProxy.realmSet$endLongitude((double) json.getDouble("endLongitude"));
            }
        }
        if (json.has("jarak")) {
            if (json.isNull("jarak")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jarak' to null.");
            } else {
                objProxy.realmSet$jarak((double) json.getDouble("jarak"));
            }
        }
        if (json.has("harga")) {
            if (json.isNull("harga")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'harga' to null.");
            } else {
                objProxy.realmSet$harga((long) json.getLong("harga"));
            }
        }
        if (json.has("waktuOrder")) {
            if (json.isNull("waktuOrder")) {
                objProxy.realmSet$waktuOrder(null);
            } else {
                Object timestamp = json.get("waktuOrder");
                if (timestamp instanceof String) {
                    objProxy.realmSet$waktuOrder(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$waktuOrder(new Date(json.getLong("waktuOrder")));
                }
            }
        }
        if (json.has("waktuSelesai")) {
            if (json.isNull("waktuSelesai")) {
                objProxy.realmSet$waktuSelesai(null);
            } else {
                Object timestamp = json.get("waktuSelesai");
                if (timestamp instanceof String) {
                    objProxy.realmSet$waktuSelesai(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$waktuSelesai(new Date(json.getLong("waktuSelesai")));
                }
            }
        }
        if (json.has("alamatAsal")) {
            if (json.isNull("alamatAsal")) {
                objProxy.realmSet$alamatAsal(null);
            } else {
                objProxy.realmSet$alamatAsal((String) json.getString("alamatAsal"));
            }
        }
        if (json.has("alamatTujuan")) {
            if (json.isNull("alamatTujuan")) {
                objProxy.realmSet$alamatTujuan(null);
            } else {
                objProxy.realmSet$alamatTujuan((String) json.getString("alamatTujuan"));
            }
        }
        if (json.has("kodePromo")) {
            if (json.isNull("kodePromo")) {
                objProxy.realmSet$kodePromo(null);
            } else {
                objProxy.realmSet$kodePromo((String) json.getString("kodePromo"));
            }
        }
        if (json.has("kreditPromo")) {
            if (json.isNull("kreditPromo")) {
                objProxy.realmSet$kreditPromo(null);
            } else {
                objProxy.realmSet$kreditPromo((String) json.getString("kreditPromo"));
            }
        }
        if (json.has("isPakaiWallet")) {
            if (json.isNull("isPakaiWallet")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isPakaiWallet' to null.");
            } else {
                objProxy.realmSet$isPakaiWallet((boolean) json.getBoolean("isPakaiWallet"));
            }
        }
        if (json.has("rate")) {
            if (json.isNull("rate")) {
                objProxy.realmSet$rate(null);
            } else {
                objProxy.realmSet$rate((String) json.getString("rate"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            } else {
                objProxy.realmSet$status((int) json.getInt("status"));
            }
        }
        if (json.has("estimasi")) {
            if (json.isNull("estimasi")) {
                objProxy.realmSet$estimasi(null);
            } else {
                objProxy.realmSet$estimasi((String) json.getString("estimasi"));
            }
        }
        if (json.has("namaPengirim")) {
            if (json.isNull("namaPengirim")) {
                objProxy.realmSet$namaPengirim(null);
            } else {
                objProxy.realmSet$namaPengirim((String) json.getString("namaPengirim"));
            }
        }
        if (json.has("teleponPengirim")) {
            if (json.isNull("teleponPengirim")) {
                objProxy.realmSet$teleponPengirim(null);
            } else {
                objProxy.realmSet$teleponPengirim((String) json.getString("teleponPengirim"));
            }
        }
        if (json.has("namaPenerima")) {
            if (json.isNull("namaPenerima")) {
                objProxy.realmSet$namaPenerima(null);
            } else {
                objProxy.realmSet$namaPenerima((String) json.getString("namaPenerima"));
            }
        }
        if (json.has("teleponPenerima")) {
            if (json.isNull("teleponPenerima")) {
                objProxy.realmSet$teleponPenerima(null);
            } else {
                objProxy.realmSet$teleponPenerima((String) json.getString("teleponPenerima"));
            }
        }
        if (json.has("namaBarang")) {
            if (json.isNull("namaBarang")) {
                objProxy.realmSet$namaBarang(null);
            } else {
                objProxy.realmSet$namaBarang((String) json.getString("namaBarang"));
            }
        }
        if (json.has("number_of_loaders")) {
            if (json.isNull("number_of_loaders")) {
                objProxy.realmSet$number_of_loaders(null);
            } else {
                objProxy.realmSet$number_of_loaders((String) json.getString("number_of_loaders"));
            }
        }
        if (json.has("delivery_type")) {
            if (json.isNull("delivery_type")) {
                objProxy.realmSet$delivery_type(null);
            } else {
                objProxy.realmSet$delivery_type((String) json.getString("delivery_type"));
            }
        }
        if (json.has("estimated_weight")) {
            if (json.isNull("estimated_weight")) {
                objProxy.realmSet$estimated_weight(null);
            } else {
                objProxy.realmSet$estimated_weight((String) json.getString("estimated_weight"));
            }
        }
        if (json.has("isRental")) {
            if (json.isNull("isRental")) {
                objProxy.realmSet$isRental(null);
            } else {
                objProxy.realmSet$isRental((boolean) json.getBoolean("isRental"));
            }
        }
        if (json.has("remarks")) {
            if (json.isNull("remarks")) {
                objProxy.realmSet$remarks(null);
            } else {
                objProxy.realmSet$remarks((String) json.getString("remarks"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.TransaksiSendModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.TransaksiSendModel obj = new com.ourdevelops.ourjek.models.TransaksiSendModel();
        final com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) obj;
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
                jsonHasPrimaryKey = true;
            } else if (name.equals("idPelanggan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idPelanggan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idPelanggan(null);
                }
            } else if (name.equals("idDriver")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idDriver((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idDriver(null);
                }
            } else if (name.equals("orderFitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$orderFitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$orderFitur(null);
                }
            } else if (name.equals("startLatitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$startLatitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startLatitude' to null.");
                }
            } else if (name.equals("startLongitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$startLongitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startLongitude' to null.");
                }
            } else if (name.equals("endLatitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$endLatitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endLatitude' to null.");
                }
            } else if (name.equals("endLongitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$endLongitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endLongitude' to null.");
                }
            } else if (name.equals("jarak")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jarak((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jarak' to null.");
                }
            } else if (name.equals("harga")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$harga((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'harga' to null.");
                }
            } else if (name.equals("waktuOrder")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$waktuOrder(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$waktuOrder(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$waktuOrder(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("waktuSelesai")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$waktuSelesai(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$waktuSelesai(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$waktuSelesai(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("alamatAsal")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alamatAsal((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alamatAsal(null);
                }
            } else if (name.equals("alamatTujuan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alamatTujuan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alamatTujuan(null);
                }
            } else if (name.equals("kodePromo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kodePromo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kodePromo(null);
                }
            } else if (name.equals("kreditPromo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$kreditPromo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$kreditPromo(null);
                }
            } else if (name.equals("isPakaiWallet")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isPakaiWallet((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isPakaiWallet' to null.");
                }
            } else if (name.equals("rate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$rate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$rate(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
                }
            } else if (name.equals("estimasi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$estimasi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$estimasi(null);
                }
            } else if (name.equals("namaPengirim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaPengirim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaPengirim(null);
                }
            } else if (name.equals("teleponPengirim")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$teleponPengirim((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$teleponPengirim(null);
                }
            } else if (name.equals("namaPenerima")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaPenerima((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaPenerima(null);
                }
            } else if (name.equals("teleponPenerima")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$teleponPenerima((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$teleponPenerima(null);
                }
            } else if (name.equals("namaBarang")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$namaBarang((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$namaBarang(null);
                }
            } else if (name.equals("number_of_loaders")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$number_of_loaders((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$number_of_loaders(null);
                }
            } else if (name.equals("delivery_type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delivery_type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$delivery_type(null);
                }
            } else if (name.equals("estimated_weight")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$estimated_weight((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$estimated_weight(null);
                }
            } else if (name.equals("isRental")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isRental((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$isRental(null);
                }
            } else if (name.equals("remarks")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$remarks((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$remarks(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.TransaksiSendModel copyOrUpdate(Realm realm, TransaksiSendModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.TransaksiSendModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.TransaksiSendModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.TransaksiSendModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$id();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.TransaksiSendModel copy(Realm realm, TransaksiSendModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.TransaksiSendModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.TransaksiSendModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addDouble(columnInfo.startLatitudeColKey, realmObjectSource.realmGet$startLatitude());
        builder.addDouble(columnInfo.startLongitudeColKey, realmObjectSource.realmGet$startLongitude());
        builder.addDouble(columnInfo.endLatitudeColKey, realmObjectSource.realmGet$endLatitude());
        builder.addDouble(columnInfo.endLongitudeColKey, realmObjectSource.realmGet$endLongitude());
        builder.addDouble(columnInfo.jarakColKey, realmObjectSource.realmGet$jarak());
        builder.addInteger(columnInfo.hargaColKey, realmObjectSource.realmGet$harga());
        builder.addDate(columnInfo.waktuOrderColKey, realmObjectSource.realmGet$waktuOrder());
        builder.addDate(columnInfo.waktuSelesaiColKey, realmObjectSource.realmGet$waktuSelesai());
        builder.addString(columnInfo.alamatAsalColKey, realmObjectSource.realmGet$alamatAsal());
        builder.addString(columnInfo.alamatTujuanColKey, realmObjectSource.realmGet$alamatTujuan());
        builder.addString(columnInfo.kodePromoColKey, realmObjectSource.realmGet$kodePromo());
        builder.addString(columnInfo.kreditPromoColKey, realmObjectSource.realmGet$kreditPromo());
        builder.addBoolean(columnInfo.isPakaiWalletColKey, realmObjectSource.realmGet$isPakaiWallet());
        builder.addString(columnInfo.rateColKey, realmObjectSource.realmGet$rate());
        builder.addInteger(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.estimasiColKey, realmObjectSource.realmGet$estimasi());
        builder.addString(columnInfo.namaPengirimColKey, realmObjectSource.realmGet$namaPengirim());
        builder.addString(columnInfo.teleponPengirimColKey, realmObjectSource.realmGet$teleponPengirim());
        builder.addString(columnInfo.namaPenerimaColKey, realmObjectSource.realmGet$namaPenerima());
        builder.addString(columnInfo.teleponPenerimaColKey, realmObjectSource.realmGet$teleponPenerima());
        builder.addString(columnInfo.namaBarangColKey, realmObjectSource.realmGet$namaBarang());
        builder.addString(columnInfo.number_of_loadersColKey, realmObjectSource.realmGet$number_of_loaders());
        builder.addString(columnInfo.delivery_typeColKey, realmObjectSource.realmGet$delivery_type());
        builder.addString(columnInfo.estimated_weightColKey, realmObjectSource.realmGet$estimated_weight());
        builder.addBoolean(columnInfo.isRentalColKey, realmObjectSource.realmGet$isRental());
        builder.addString(columnInfo.remarksColKey, realmObjectSource.realmGet$remarks());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.TransaksiSendModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiSendModelColumnInfo columnInfo = (TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        }
        String realmGet$number_of_loaders = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$number_of_loaders();
        if (realmGet$number_of_loaders != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, realmGet$number_of_loaders, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        }
        String realmGet$estimated_weight = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimated_weight();
        if (realmGet$estimated_weight != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimated_weightColKey, colKey, realmGet$estimated_weight, false);
        }
        Boolean realmGet$isRental = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isRental();
        if (realmGet$isRental != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isRentalColKey, colKey, realmGet$isRental, false);
        }
        String realmGet$remarks = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$remarks();
        if (realmGet$remarks != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remarksColKey, colKey, realmGet$remarks, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiSendModelColumnInfo columnInfo = (TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.TransaksiSendModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.TransaksiSendModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            }
            String realmGet$number_of_loaders = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$number_of_loaders();
            if (realmGet$number_of_loaders != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, realmGet$number_of_loaders, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            }
            String realmGet$estimated_weight = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimated_weight();
            if (realmGet$estimated_weight != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimated_weightColKey, colKey, realmGet$estimated_weight, false);
            }
            Boolean realmGet$isRental = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isRental();
            if (realmGet$isRental != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isRentalColKey, colKey, realmGet$isRental, false);
            }
            String realmGet$remarks = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$remarks();
            if (realmGet$remarks != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remarksColKey, colKey, realmGet$remarks, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.TransaksiSendModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiSendModelColumnInfo columnInfo = (TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
        }
        String realmGet$number_of_loaders = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$number_of_loaders();
        if (realmGet$number_of_loaders != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, realmGet$number_of_loaders, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
        }
        String realmGet$estimated_weight = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimated_weight();
        if (realmGet$estimated_weight != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimated_weightColKey, colKey, realmGet$estimated_weight, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.estimated_weightColKey, colKey, false);
        }
        Boolean realmGet$isRental = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isRental();
        if (realmGet$isRental != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isRentalColKey, colKey, realmGet$isRental, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.isRentalColKey, colKey, false);
        }
        String realmGet$remarks = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$remarks();
        if (realmGet$remarks != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.remarksColKey, colKey, realmGet$remarks, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.remarksColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiSendModelColumnInfo columnInfo = (TransaksiSendModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.TransaksiSendModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.TransaksiSendModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
            }
            String realmGet$number_of_loaders = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$number_of_loaders();
            if (realmGet$number_of_loaders != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, realmGet$number_of_loaders, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.number_of_loadersColKey, colKey, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
            }
            String realmGet$estimated_weight = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$estimated_weight();
            if (realmGet$estimated_weight != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimated_weightColKey, colKey, realmGet$estimated_weight, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.estimated_weightColKey, colKey, false);
            }
            Boolean realmGet$isRental = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$isRental();
            if (realmGet$isRental != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.isRentalColKey, colKey, realmGet$isRental, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.isRentalColKey, colKey, false);
            }
            String realmGet$remarks = ((com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) object).realmGet$remarks();
            if (realmGet$remarks != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.remarksColKey, colKey, realmGet$remarks, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.remarksColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.TransaksiSendModel createDetachedCopy(com.ourdevelops.ourjek.models.TransaksiSendModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.TransaksiSendModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.TransaksiSendModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.TransaksiSendModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.TransaksiSendModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$idPelanggan(realmSource.realmGet$idPelanggan());
        unmanagedCopy.realmSet$idDriver(realmSource.realmGet$idDriver());
        unmanagedCopy.realmSet$orderFitur(realmSource.realmGet$orderFitur());
        unmanagedCopy.realmSet$startLatitude(realmSource.realmGet$startLatitude());
        unmanagedCopy.realmSet$startLongitude(realmSource.realmGet$startLongitude());
        unmanagedCopy.realmSet$endLatitude(realmSource.realmGet$endLatitude());
        unmanagedCopy.realmSet$endLongitude(realmSource.realmGet$endLongitude());
        unmanagedCopy.realmSet$jarak(realmSource.realmGet$jarak());
        unmanagedCopy.realmSet$harga(realmSource.realmGet$harga());
        unmanagedCopy.realmSet$waktuOrder(realmSource.realmGet$waktuOrder());
        unmanagedCopy.realmSet$waktuSelesai(realmSource.realmGet$waktuSelesai());
        unmanagedCopy.realmSet$alamatAsal(realmSource.realmGet$alamatAsal());
        unmanagedCopy.realmSet$alamatTujuan(realmSource.realmGet$alamatTujuan());
        unmanagedCopy.realmSet$kodePromo(realmSource.realmGet$kodePromo());
        unmanagedCopy.realmSet$kreditPromo(realmSource.realmGet$kreditPromo());
        unmanagedCopy.realmSet$isPakaiWallet(realmSource.realmGet$isPakaiWallet());
        unmanagedCopy.realmSet$rate(realmSource.realmGet$rate());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$estimasi(realmSource.realmGet$estimasi());
        unmanagedCopy.realmSet$namaPengirim(realmSource.realmGet$namaPengirim());
        unmanagedCopy.realmSet$teleponPengirim(realmSource.realmGet$teleponPengirim());
        unmanagedCopy.realmSet$namaPenerima(realmSource.realmGet$namaPenerima());
        unmanagedCopy.realmSet$teleponPenerima(realmSource.realmGet$teleponPenerima());
        unmanagedCopy.realmSet$namaBarang(realmSource.realmGet$namaBarang());
        unmanagedCopy.realmSet$number_of_loaders(realmSource.realmGet$number_of_loaders());
        unmanagedCopy.realmSet$delivery_type(realmSource.realmGet$delivery_type());
        unmanagedCopy.realmSet$estimated_weight(realmSource.realmGet$estimated_weight());
        unmanagedCopy.realmSet$isRental(realmSource.realmGet$isRental());
        unmanagedCopy.realmSet$remarks(realmSource.realmGet$remarks());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.TransaksiSendModel update(Realm realm, TransaksiSendModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.TransaksiSendModel realmObject, com.ourdevelops.ourjek.models.TransaksiSendModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiSendModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addDouble(columnInfo.startLatitudeColKey, realmObjectSource.realmGet$startLatitude());
        builder.addDouble(columnInfo.startLongitudeColKey, realmObjectSource.realmGet$startLongitude());
        builder.addDouble(columnInfo.endLatitudeColKey, realmObjectSource.realmGet$endLatitude());
        builder.addDouble(columnInfo.endLongitudeColKey, realmObjectSource.realmGet$endLongitude());
        builder.addDouble(columnInfo.jarakColKey, realmObjectSource.realmGet$jarak());
        builder.addInteger(columnInfo.hargaColKey, realmObjectSource.realmGet$harga());
        builder.addDate(columnInfo.waktuOrderColKey, realmObjectSource.realmGet$waktuOrder());
        builder.addDate(columnInfo.waktuSelesaiColKey, realmObjectSource.realmGet$waktuSelesai());
        builder.addString(columnInfo.alamatAsalColKey, realmObjectSource.realmGet$alamatAsal());
        builder.addString(columnInfo.alamatTujuanColKey, realmObjectSource.realmGet$alamatTujuan());
        builder.addString(columnInfo.kodePromoColKey, realmObjectSource.realmGet$kodePromo());
        builder.addString(columnInfo.kreditPromoColKey, realmObjectSource.realmGet$kreditPromo());
        builder.addBoolean(columnInfo.isPakaiWalletColKey, realmObjectSource.realmGet$isPakaiWallet());
        builder.addString(columnInfo.rateColKey, realmObjectSource.realmGet$rate());
        builder.addInteger(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.estimasiColKey, realmObjectSource.realmGet$estimasi());
        builder.addString(columnInfo.namaPengirimColKey, realmObjectSource.realmGet$namaPengirim());
        builder.addString(columnInfo.teleponPengirimColKey, realmObjectSource.realmGet$teleponPengirim());
        builder.addString(columnInfo.namaPenerimaColKey, realmObjectSource.realmGet$namaPenerima());
        builder.addString(columnInfo.teleponPenerimaColKey, realmObjectSource.realmGet$teleponPenerima());
        builder.addString(columnInfo.namaBarangColKey, realmObjectSource.realmGet$namaBarang());
        builder.addString(columnInfo.number_of_loadersColKey, realmObjectSource.realmGet$number_of_loaders());
        builder.addString(columnInfo.delivery_typeColKey, realmObjectSource.realmGet$delivery_type());
        builder.addString(columnInfo.estimated_weightColKey, realmObjectSource.realmGet$estimated_weight());
        builder.addBoolean(columnInfo.isRentalColKey, realmObjectSource.realmGet$isRental());
        builder.addString(columnInfo.remarksColKey, realmObjectSource.realmGet$remarks());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TransaksiSendModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idPelanggan:");
        stringBuilder.append(realmGet$idPelanggan() != null ? realmGet$idPelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idDriver:");
        stringBuilder.append(realmGet$idDriver() != null ? realmGet$idDriver() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{orderFitur:");
        stringBuilder.append(realmGet$orderFitur() != null ? realmGet$orderFitur() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{startLatitude:");
        stringBuilder.append(realmGet$startLatitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{startLongitude:");
        stringBuilder.append(realmGet$startLongitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{endLatitude:");
        stringBuilder.append(realmGet$endLatitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{endLongitude:");
        stringBuilder.append(realmGet$endLongitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jarak:");
        stringBuilder.append(realmGet$jarak());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{harga:");
        stringBuilder.append(realmGet$harga());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{waktuOrder:");
        stringBuilder.append(realmGet$waktuOrder() != null ? realmGet$waktuOrder() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{waktuSelesai:");
        stringBuilder.append(realmGet$waktuSelesai() != null ? realmGet$waktuSelesai() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alamatAsal:");
        stringBuilder.append(realmGet$alamatAsal() != null ? realmGet$alamatAsal() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alamatTujuan:");
        stringBuilder.append(realmGet$alamatTujuan() != null ? realmGet$alamatTujuan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kodePromo:");
        stringBuilder.append(realmGet$kodePromo() != null ? realmGet$kodePromo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{kreditPromo:");
        stringBuilder.append(realmGet$kreditPromo() != null ? realmGet$kreditPromo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isPakaiWallet:");
        stringBuilder.append(realmGet$isPakaiWallet());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{rate:");
        stringBuilder.append(realmGet$rate() != null ? realmGet$rate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{estimasi:");
        stringBuilder.append(realmGet$estimasi() != null ? realmGet$estimasi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaPengirim:");
        stringBuilder.append(realmGet$namaPengirim() != null ? realmGet$namaPengirim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{teleponPengirim:");
        stringBuilder.append(realmGet$teleponPengirim() != null ? realmGet$teleponPengirim() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaPenerima:");
        stringBuilder.append(realmGet$namaPenerima() != null ? realmGet$namaPenerima() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{teleponPenerima:");
        stringBuilder.append(realmGet$teleponPenerima() != null ? realmGet$teleponPenerima() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{namaBarang:");
        stringBuilder.append(realmGet$namaBarang() != null ? realmGet$namaBarang() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{number_of_loaders:");
        stringBuilder.append(realmGet$number_of_loaders() != null ? realmGet$number_of_loaders() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delivery_type:");
        stringBuilder.append(realmGet$delivery_type() != null ? realmGet$delivery_type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{estimated_weight:");
        stringBuilder.append(realmGet$estimated_weight() != null ? realmGet$estimated_weight() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isRental:");
        stringBuilder.append(realmGet$isRental() != null ? realmGet$isRental() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{remarks:");
        stringBuilder.append(realmGet$remarks() != null ? realmGet$remarks() : "null");
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
        com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy aTransaksiSendModel = (com_ourdevelops_ourjek_models_TransaksiSendModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTransaksiSendModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTransaksiSendModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTransaksiSendModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
