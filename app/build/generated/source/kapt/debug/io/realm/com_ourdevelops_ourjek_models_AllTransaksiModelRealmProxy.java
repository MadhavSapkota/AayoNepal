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
public class com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy extends com.ourdevelops.ourjek.models.AllTransaksiModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface {

    static final class AllTransaksiModelColumnInfo extends ColumnInfo {
        long idColKey;
        long idPelangganColKey;
        long idTransaksiColKey;
        long idDriverColKey;
        long orderFiturColKey;
        long totalbiayaColKey;
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
        long iconColKey;
        long fiturColKey;
        long id_fiturColKey;
        long biayaakhirColKey;
        long statustransaksiColKey;
        long after_discountColKey;
        long delivery_typeColKey;
        long sender_nameColKey;
        long sender_numberColKey;
        long receiver_nameColKey;
        long receiver_numberColKey;
        long total_priceColKey;

        AllTransaksiModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(33);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AllTransaksiModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.idPelangganColKey = addColumnDetails("idPelanggan", "idPelanggan", objectSchemaInfo);
            this.idTransaksiColKey = addColumnDetails("idTransaksi", "idTransaksi", objectSchemaInfo);
            this.idDriverColKey = addColumnDetails("idDriver", "idDriver", objectSchemaInfo);
            this.orderFiturColKey = addColumnDetails("orderFitur", "orderFitur", objectSchemaInfo);
            this.totalbiayaColKey = addColumnDetails("totalbiaya", "totalbiaya", objectSchemaInfo);
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
            this.iconColKey = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.fiturColKey = addColumnDetails("fitur", "fitur", objectSchemaInfo);
            this.id_fiturColKey = addColumnDetails("id_fitur", "id_fitur", objectSchemaInfo);
            this.biayaakhirColKey = addColumnDetails("biayaakhir", "biayaakhir", objectSchemaInfo);
            this.statustransaksiColKey = addColumnDetails("statustransaksi", "statustransaksi", objectSchemaInfo);
            this.after_discountColKey = addColumnDetails("after_discount", "after_discount", objectSchemaInfo);
            this.delivery_typeColKey = addColumnDetails("delivery_type", "delivery_type", objectSchemaInfo);
            this.sender_nameColKey = addColumnDetails("sender_name", "sender_name", objectSchemaInfo);
            this.sender_numberColKey = addColumnDetails("sender_number", "sender_number", objectSchemaInfo);
            this.receiver_nameColKey = addColumnDetails("receiver_name", "receiver_name", objectSchemaInfo);
            this.receiver_numberColKey = addColumnDetails("receiver_number", "receiver_number", objectSchemaInfo);
            this.total_priceColKey = addColumnDetails("total_price", "total_price", objectSchemaInfo);
        }

        AllTransaksiModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AllTransaksiModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AllTransaksiModelColumnInfo src = (AllTransaksiModelColumnInfo) rawSrc;
            final AllTransaksiModelColumnInfo dst = (AllTransaksiModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.idPelangganColKey = src.idPelangganColKey;
            dst.idTransaksiColKey = src.idTransaksiColKey;
            dst.idDriverColKey = src.idDriverColKey;
            dst.orderFiturColKey = src.orderFiturColKey;
            dst.totalbiayaColKey = src.totalbiayaColKey;
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
            dst.iconColKey = src.iconColKey;
            dst.fiturColKey = src.fiturColKey;
            dst.id_fiturColKey = src.id_fiturColKey;
            dst.biayaakhirColKey = src.biayaakhirColKey;
            dst.statustransaksiColKey = src.statustransaksiColKey;
            dst.after_discountColKey = src.after_discountColKey;
            dst.delivery_typeColKey = src.delivery_typeColKey;
            dst.sender_nameColKey = src.sender_nameColKey;
            dst.sender_numberColKey = src.sender_numberColKey;
            dst.receiver_nameColKey = src.receiver_nameColKey;
            dst.receiver_numberColKey = src.receiver_numberColKey;
            dst.total_priceColKey = src.total_priceColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AllTransaksiModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.AllTransaksiModel> proxyState;

    com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AllTransaksiModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.AllTransaksiModel>(this);
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
    public String realmGet$idTransaksi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idTransaksiColKey);
    }

    @Override
    public void realmSet$idTransaksi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idTransaksiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idTransaksiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idTransaksiColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idTransaksiColKey, value);
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
    public String realmGet$totalbiaya() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.totalbiayaColKey);
    }

    @Override
    public void realmSet$totalbiaya(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.totalbiayaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.totalbiayaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.totalbiayaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.totalbiayaColKey, value);
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

    @Override
    @SuppressWarnings("cast")
    public String realmGet$biayaakhir() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.biayaakhirColKey);
    }

    @Override
    public void realmSet$biayaakhir(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.biayaakhirColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.biayaakhirColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.biayaakhirColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.biayaakhirColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$statustransaksi() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statustransaksiColKey);
    }

    @Override
    public void realmSet$statustransaksi(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statustransaksiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.statustransaksiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statustransaksiColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statustransaksiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$after_discount() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.after_discountColKey);
    }

    @Override
    public void realmSet$after_discount(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.after_discountColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.after_discountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.after_discountColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.after_discountColKey, value);
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
    public String realmGet$sender_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sender_nameColKey);
    }

    @Override
    public void realmSet$sender_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sender_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sender_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sender_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sender_nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sender_number() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sender_numberColKey);
    }

    @Override
    public void realmSet$sender_number(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sender_numberColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sender_numberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sender_numberColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sender_numberColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$receiver_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.receiver_nameColKey);
    }

    @Override
    public void realmSet$receiver_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.receiver_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.receiver_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.receiver_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.receiver_nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$receiver_number() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.receiver_numberColKey);
    }

    @Override
    public void realmSet$receiver_number(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.receiver_numberColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.receiver_numberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.receiver_numberColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.receiver_numberColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$total_price() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.total_priceColKey);
    }

    @Override
    public void realmSet$total_price(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.total_priceColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.total_priceColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.total_priceColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.total_priceColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AllTransaksiModel", 33, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idPelanggan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idTransaksi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idDriver", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("orderFitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("totalbiaya", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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
        builder.addPersistedProperty("icon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id_fitur", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("biayaakhir", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("statustransaksi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("after_discount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delivery_type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sender_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sender_number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("receiver_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("receiver_number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("total_price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AllTransaksiModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AllTransaksiModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AllTransaksiModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AllTransaksiModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.AllTransaksiModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.AllTransaksiModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
            AllTransaksiModelColumnInfo columnInfo = (AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
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
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.AllTransaksiModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.AllTransaksiModel.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) obj;
        if (json.has("idPelanggan")) {
            if (json.isNull("idPelanggan")) {
                objProxy.realmSet$idPelanggan(null);
            } else {
                objProxy.realmSet$idPelanggan((String) json.getString("idPelanggan"));
            }
        }
        if (json.has("idTransaksi")) {
            if (json.isNull("idTransaksi")) {
                objProxy.realmSet$idTransaksi(null);
            } else {
                objProxy.realmSet$idTransaksi((String) json.getString("idTransaksi"));
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
        if (json.has("totalbiaya")) {
            if (json.isNull("totalbiaya")) {
                objProxy.realmSet$totalbiaya(null);
            } else {
                objProxy.realmSet$totalbiaya((String) json.getString("totalbiaya"));
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
        if (json.has("icon")) {
            if (json.isNull("icon")) {
                objProxy.realmSet$icon(null);
            } else {
                objProxy.realmSet$icon((String) json.getString("icon"));
            }
        }
        if (json.has("fitur")) {
            if (json.isNull("fitur")) {
                objProxy.realmSet$fitur(null);
            } else {
                objProxy.realmSet$fitur((String) json.getString("fitur"));
            }
        }
        if (json.has("id_fitur")) {
            if (json.isNull("id_fitur")) {
                objProxy.realmSet$id_fitur(null);
            } else {
                objProxy.realmSet$id_fitur((String) json.getString("id_fitur"));
            }
        }
        if (json.has("biayaakhir")) {
            if (json.isNull("biayaakhir")) {
                objProxy.realmSet$biayaakhir(null);
            } else {
                objProxy.realmSet$biayaakhir((String) json.getString("biayaakhir"));
            }
        }
        if (json.has("statustransaksi")) {
            if (json.isNull("statustransaksi")) {
                objProxy.realmSet$statustransaksi(null);
            } else {
                objProxy.realmSet$statustransaksi((String) json.getString("statustransaksi"));
            }
        }
        if (json.has("after_discount")) {
            if (json.isNull("after_discount")) {
                objProxy.realmSet$after_discount(null);
            } else {
                objProxy.realmSet$after_discount((String) json.getString("after_discount"));
            }
        }
        if (json.has("delivery_type")) {
            if (json.isNull("delivery_type")) {
                objProxy.realmSet$delivery_type(null);
            } else {
                objProxy.realmSet$delivery_type((String) json.getString("delivery_type"));
            }
        }
        if (json.has("sender_name")) {
            if (json.isNull("sender_name")) {
                objProxy.realmSet$sender_name(null);
            } else {
                objProxy.realmSet$sender_name((String) json.getString("sender_name"));
            }
        }
        if (json.has("sender_number")) {
            if (json.isNull("sender_number")) {
                objProxy.realmSet$sender_number(null);
            } else {
                objProxy.realmSet$sender_number((String) json.getString("sender_number"));
            }
        }
        if (json.has("receiver_name")) {
            if (json.isNull("receiver_name")) {
                objProxy.realmSet$receiver_name(null);
            } else {
                objProxy.realmSet$receiver_name((String) json.getString("receiver_name"));
            }
        }
        if (json.has("receiver_number")) {
            if (json.isNull("receiver_number")) {
                objProxy.realmSet$receiver_number(null);
            } else {
                objProxy.realmSet$receiver_number((String) json.getString("receiver_number"));
            }
        }
        if (json.has("total_price")) {
            if (json.isNull("total_price")) {
                objProxy.realmSet$total_price(null);
            } else {
                objProxy.realmSet$total_price((String) json.getString("total_price"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.AllTransaksiModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.AllTransaksiModel obj = new com.ourdevelops.ourjek.models.AllTransaksiModel();
        final com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) obj;
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
            } else if (name.equals("idTransaksi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idTransaksi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idTransaksi(null);
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
            } else if (name.equals("totalbiaya")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$totalbiaya((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$totalbiaya(null);
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
            } else if (name.equals("icon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon(null);
                }
            } else if (name.equals("fitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fitur(null);
                }
            } else if (name.equals("id_fitur")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id_fitur((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id_fitur(null);
                }
            } else if (name.equals("biayaakhir")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biayaakhir((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$biayaakhir(null);
                }
            } else if (name.equals("statustransaksi")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$statustransaksi((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$statustransaksi(null);
                }
            } else if (name.equals("after_discount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$after_discount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$after_discount(null);
                }
            } else if (name.equals("delivery_type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delivery_type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$delivery_type(null);
                }
            } else if (name.equals("sender_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sender_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sender_name(null);
                }
            } else if (name.equals("sender_number")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sender_number((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sender_number(null);
                }
            } else if (name.equals("receiver_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$receiver_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$receiver_name(null);
                }
            } else if (name.equals("receiver_number")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$receiver_number((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$receiver_number(null);
                }
            } else if (name.equals("total_price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$total_price((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$total_price(null);
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

    private static com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.AllTransaksiModel copyOrUpdate(Realm realm, AllTransaksiModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.AllTransaksiModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.AllTransaksiModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.AllTransaksiModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.AllTransaksiModel copy(Realm realm, AllTransaksiModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.AllTransaksiModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.AllTransaksiModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idTransaksiColKey, realmObjectSource.realmGet$idTransaksi());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addString(columnInfo.totalbiayaColKey, realmObjectSource.realmGet$totalbiaya());
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
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addString(columnInfo.fiturColKey, realmObjectSource.realmGet$fitur());
        builder.addString(columnInfo.id_fiturColKey, realmObjectSource.realmGet$id_fitur());
        builder.addString(columnInfo.biayaakhirColKey, realmObjectSource.realmGet$biayaakhir());
        builder.addString(columnInfo.statustransaksiColKey, realmObjectSource.realmGet$statustransaksi());
        builder.addString(columnInfo.after_discountColKey, realmObjectSource.realmGet$after_discount());
        builder.addString(columnInfo.delivery_typeColKey, realmObjectSource.realmGet$delivery_type());
        builder.addString(columnInfo.sender_nameColKey, realmObjectSource.realmGet$sender_name());
        builder.addString(columnInfo.sender_numberColKey, realmObjectSource.realmGet$sender_number());
        builder.addString(columnInfo.receiver_nameColKey, realmObjectSource.realmGet$receiver_name());
        builder.addString(columnInfo.receiver_numberColKey, realmObjectSource.realmGet$receiver_number());
        builder.addString(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.AllTransaksiModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        AllTransaksiModelColumnInfo columnInfo = (AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        }
        String realmGet$idTransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idTransaksi();
        if (realmGet$idTransaksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idTransaksiColKey, colKey, realmGet$idTransaksi, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        }
        String realmGet$totalbiaya = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$totalbiaya();
        if (realmGet$totalbiaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.totalbiayaColKey, colKey, realmGet$totalbiaya, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$icon = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        }
        String realmGet$fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$fitur();
        if (realmGet$fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
        }
        String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id_fitur();
        if (realmGet$id_fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
        }
        String realmGet$biayaakhir = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$biayaakhir();
        if (realmGet$biayaakhir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.biayaakhirColKey, colKey, realmGet$biayaakhir, false);
        }
        String realmGet$statustransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$statustransaksi();
        if (realmGet$statustransaksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statustransaksiColKey, colKey, realmGet$statustransaksi, false);
        }
        String realmGet$after_discount = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$after_discount();
        if (realmGet$after_discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.after_discountColKey, colKey, realmGet$after_discount, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        }
        String realmGet$sender_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_name();
        if (realmGet$sender_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
        }
        String realmGet$sender_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_number();
        if (realmGet$sender_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
        }
        String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
        if (realmGet$receiver_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
        }
        String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
        if (realmGet$receiver_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        AllTransaksiModelColumnInfo columnInfo = (AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.AllTransaksiModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.AllTransaksiModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            }
            String realmGet$idTransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idTransaksi();
            if (realmGet$idTransaksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idTransaksiColKey, colKey, realmGet$idTransaksi, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            }
            String realmGet$totalbiaya = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$totalbiaya();
            if (realmGet$totalbiaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.totalbiayaColKey, colKey, realmGet$totalbiaya, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$icon = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            }
            String realmGet$fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$fitur();
            if (realmGet$fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
            }
            String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id_fitur();
            if (realmGet$id_fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
            }
            String realmGet$biayaakhir = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$biayaakhir();
            if (realmGet$biayaakhir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.biayaakhirColKey, colKey, realmGet$biayaakhir, false);
            }
            String realmGet$statustransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$statustransaksi();
            if (realmGet$statustransaksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statustransaksiColKey, colKey, realmGet$statustransaksi, false);
            }
            String realmGet$after_discount = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$after_discount();
            if (realmGet$after_discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.after_discountColKey, colKey, realmGet$after_discount, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            }
            String realmGet$sender_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_name();
            if (realmGet$sender_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
            }
            String realmGet$sender_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_number();
            if (realmGet$sender_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
            }
            String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
            if (realmGet$receiver_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
            }
            String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
            if (realmGet$receiver_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.AllTransaksiModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        AllTransaksiModelColumnInfo columnInfo = (AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id();
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
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
        }
        String realmGet$idTransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idTransaksi();
        if (realmGet$idTransaksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idTransaksiColKey, colKey, realmGet$idTransaksi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idTransaksiColKey, colKey, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
        }
        String realmGet$totalbiaya = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$totalbiaya();
        if (realmGet$totalbiaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.totalbiayaColKey, colKey, realmGet$totalbiaya, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.totalbiayaColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$status(), false);
        String realmGet$icon = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
        }
        String realmGet$fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$fitur();
        if (realmGet$fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fiturColKey, colKey, false);
        }
        String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id_fitur();
        if (realmGet$id_fitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.id_fiturColKey, colKey, false);
        }
        String realmGet$biayaakhir = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$biayaakhir();
        if (realmGet$biayaakhir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.biayaakhirColKey, colKey, realmGet$biayaakhir, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.biayaakhirColKey, colKey, false);
        }
        String realmGet$statustransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$statustransaksi();
        if (realmGet$statustransaksi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statustransaksiColKey, colKey, realmGet$statustransaksi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statustransaksiColKey, colKey, false);
        }
        String realmGet$after_discount = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$after_discount();
        if (realmGet$after_discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.after_discountColKey, colKey, realmGet$after_discount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.after_discountColKey, colKey, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
        }
        String realmGet$sender_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_name();
        if (realmGet$sender_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sender_nameColKey, colKey, false);
        }
        String realmGet$sender_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_number();
        if (realmGet$sender_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sender_numberColKey, colKey, false);
        }
        String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
        if (realmGet$receiver_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.receiver_nameColKey, colKey, false);
        }
        String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
        if (realmGet$receiver_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.receiver_numberColKey, colKey, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        AllTransaksiModelColumnInfo columnInfo = (AllTransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.AllTransaksiModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.AllTransaksiModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id();
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
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
            }
            String realmGet$idTransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idTransaksi();
            if (realmGet$idTransaksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idTransaksiColKey, colKey, realmGet$idTransaksi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idTransaksiColKey, colKey, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
            }
            String realmGet$totalbiaya = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$totalbiaya();
            if (realmGet$totalbiaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.totalbiayaColKey, colKey, realmGet$totalbiaya, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.totalbiayaColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.statusColKey, colKey, ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$status(), false);
            String realmGet$icon = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
            }
            String realmGet$fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$fitur();
            if (realmGet$fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fiturColKey, colKey, realmGet$fitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fiturColKey, colKey, false);
            }
            String realmGet$id_fitur = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$id_fitur();
            if (realmGet$id_fitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.id_fiturColKey, colKey, realmGet$id_fitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.id_fiturColKey, colKey, false);
            }
            String realmGet$biayaakhir = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$biayaakhir();
            if (realmGet$biayaakhir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.biayaakhirColKey, colKey, realmGet$biayaakhir, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.biayaakhirColKey, colKey, false);
            }
            String realmGet$statustransaksi = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$statustransaksi();
            if (realmGet$statustransaksi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statustransaksiColKey, colKey, realmGet$statustransaksi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statustransaksiColKey, colKey, false);
            }
            String realmGet$after_discount = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$after_discount();
            if (realmGet$after_discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.after_discountColKey, colKey, realmGet$after_discount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.after_discountColKey, colKey, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
            }
            String realmGet$sender_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_name();
            if (realmGet$sender_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sender_nameColKey, colKey, false);
            }
            String realmGet$sender_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$sender_number();
            if (realmGet$sender_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sender_numberColKey, colKey, false);
            }
            String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
            if (realmGet$receiver_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.receiver_nameColKey, colKey, false);
            }
            String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
            if (realmGet$receiver_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.receiver_numberColKey, colKey, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.AllTransaksiModel createDetachedCopy(com.ourdevelops.ourjek.models.AllTransaksiModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.AllTransaksiModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.AllTransaksiModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.AllTransaksiModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.AllTransaksiModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$idPelanggan(realmSource.realmGet$idPelanggan());
        unmanagedCopy.realmSet$idTransaksi(realmSource.realmGet$idTransaksi());
        unmanagedCopy.realmSet$idDriver(realmSource.realmGet$idDriver());
        unmanagedCopy.realmSet$orderFitur(realmSource.realmGet$orderFitur());
        unmanagedCopy.realmSet$totalbiaya(realmSource.realmGet$totalbiaya());
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
        unmanagedCopy.realmSet$icon(realmSource.realmGet$icon());
        unmanagedCopy.realmSet$fitur(realmSource.realmGet$fitur());
        unmanagedCopy.realmSet$id_fitur(realmSource.realmGet$id_fitur());
        unmanagedCopy.realmSet$biayaakhir(realmSource.realmGet$biayaakhir());
        unmanagedCopy.realmSet$statustransaksi(realmSource.realmGet$statustransaksi());
        unmanagedCopy.realmSet$after_discount(realmSource.realmGet$after_discount());
        unmanagedCopy.realmSet$delivery_type(realmSource.realmGet$delivery_type());
        unmanagedCopy.realmSet$sender_name(realmSource.realmGet$sender_name());
        unmanagedCopy.realmSet$sender_number(realmSource.realmGet$sender_number());
        unmanagedCopy.realmSet$receiver_name(realmSource.realmGet$receiver_name());
        unmanagedCopy.realmSet$receiver_number(realmSource.realmGet$receiver_number());
        unmanagedCopy.realmSet$total_price(realmSource.realmGet$total_price());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.AllTransaksiModel update(Realm realm, AllTransaksiModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.AllTransaksiModel realmObject, com.ourdevelops.ourjek.models.AllTransaksiModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.AllTransaksiModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.idPelangganColKey, realmObjectSource.realmGet$idPelanggan());
        builder.addString(columnInfo.idTransaksiColKey, realmObjectSource.realmGet$idTransaksi());
        builder.addString(columnInfo.idDriverColKey, realmObjectSource.realmGet$idDriver());
        builder.addString(columnInfo.orderFiturColKey, realmObjectSource.realmGet$orderFitur());
        builder.addString(columnInfo.totalbiayaColKey, realmObjectSource.realmGet$totalbiaya());
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
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addString(columnInfo.fiturColKey, realmObjectSource.realmGet$fitur());
        builder.addString(columnInfo.id_fiturColKey, realmObjectSource.realmGet$id_fitur());
        builder.addString(columnInfo.biayaakhirColKey, realmObjectSource.realmGet$biayaakhir());
        builder.addString(columnInfo.statustransaksiColKey, realmObjectSource.realmGet$statustransaksi());
        builder.addString(columnInfo.after_discountColKey, realmObjectSource.realmGet$after_discount());
        builder.addString(columnInfo.delivery_typeColKey, realmObjectSource.realmGet$delivery_type());
        builder.addString(columnInfo.sender_nameColKey, realmObjectSource.realmGet$sender_name());
        builder.addString(columnInfo.sender_numberColKey, realmObjectSource.realmGet$sender_number());
        builder.addString(columnInfo.receiver_nameColKey, realmObjectSource.realmGet$receiver_name());
        builder.addString(columnInfo.receiver_numberColKey, realmObjectSource.realmGet$receiver_number());
        builder.addString(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AllTransaksiModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idPelanggan:");
        stringBuilder.append(realmGet$idPelanggan() != null ? realmGet$idPelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idTransaksi:");
        stringBuilder.append(realmGet$idTransaksi() != null ? realmGet$idTransaksi() : "null");
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
        stringBuilder.append("{totalbiaya:");
        stringBuilder.append(realmGet$totalbiaya() != null ? realmGet$totalbiaya() : "null");
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
        stringBuilder.append("{icon:");
        stringBuilder.append(realmGet$icon() != null ? realmGet$icon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fitur:");
        stringBuilder.append(realmGet$fitur() != null ? realmGet$fitur() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id_fitur:");
        stringBuilder.append(realmGet$id_fitur() != null ? realmGet$id_fitur() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{biayaakhir:");
        stringBuilder.append(realmGet$biayaakhir() != null ? realmGet$biayaakhir() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{statustransaksi:");
        stringBuilder.append(realmGet$statustransaksi() != null ? realmGet$statustransaksi() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{after_discount:");
        stringBuilder.append(realmGet$after_discount() != null ? realmGet$after_discount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delivery_type:");
        stringBuilder.append(realmGet$delivery_type() != null ? realmGet$delivery_type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sender_name:");
        stringBuilder.append(realmGet$sender_name() != null ? realmGet$sender_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sender_number:");
        stringBuilder.append(realmGet$sender_number() != null ? realmGet$sender_number() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{receiver_name:");
        stringBuilder.append(realmGet$receiver_name() != null ? realmGet$receiver_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{receiver_number:");
        stringBuilder.append(realmGet$receiver_number() != null ? realmGet$receiver_number() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{total_price:");
        stringBuilder.append(realmGet$total_price() != null ? realmGet$total_price() : "null");
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
        com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy aAllTransaksiModel = (com_ourdevelops_ourjek_models_AllTransaksiModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAllTransaksiModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAllTransaksiModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAllTransaksiModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
