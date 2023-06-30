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
public class com_ourdevelops_ourjek_models_TransaksiModelRealmProxy extends com.ourdevelops.ourjek.models.TransaksiModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface {

    static final class TransaksiModelColumnInfo extends ColumnInfo {
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
        long biaya_akhirColKey;
        long total_biayaColKey;
        long nama_merchantColKey;
        long token_merchantColKey;
        long idtransmerchantColKey;
        long vatColKey;
        long service_chargeColKey;
        long discountColKey;
        long discount_totalColKey;
        long grand_totalColKey;
        long delivery_typeColKey;
        long sender_nameColKey;
        long sender_numberColKey;
        long receiver_nameColKey;
        long receiver_numberColKey;
        long total_priceColKey;
        long promo_codeColKey;

        TransaksiModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(42);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TransaksiModel");
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
            this.biaya_akhirColKey = addColumnDetails("biaya_akhir", "biaya_akhir", objectSchemaInfo);
            this.total_biayaColKey = addColumnDetails("total_biaya", "total_biaya", objectSchemaInfo);
            this.nama_merchantColKey = addColumnDetails("nama_merchant", "nama_merchant", objectSchemaInfo);
            this.token_merchantColKey = addColumnDetails("token_merchant", "token_merchant", objectSchemaInfo);
            this.idtransmerchantColKey = addColumnDetails("idtransmerchant", "idtransmerchant", objectSchemaInfo);
            this.vatColKey = addColumnDetails("vat", "vat", objectSchemaInfo);
            this.service_chargeColKey = addColumnDetails("service_charge", "service_charge", objectSchemaInfo);
            this.discountColKey = addColumnDetails("discount", "discount", objectSchemaInfo);
            this.discount_totalColKey = addColumnDetails("discount_total", "discount_total", objectSchemaInfo);
            this.grand_totalColKey = addColumnDetails("grand_total", "grand_total", objectSchemaInfo);
            this.delivery_typeColKey = addColumnDetails("delivery_type", "delivery_type", objectSchemaInfo);
            this.sender_nameColKey = addColumnDetails("sender_name", "sender_name", objectSchemaInfo);
            this.sender_numberColKey = addColumnDetails("sender_number", "sender_number", objectSchemaInfo);
            this.receiver_nameColKey = addColumnDetails("receiver_name", "receiver_name", objectSchemaInfo);
            this.receiver_numberColKey = addColumnDetails("receiver_number", "receiver_number", objectSchemaInfo);
            this.total_priceColKey = addColumnDetails("total_price", "total_price", objectSchemaInfo);
            this.promo_codeColKey = addColumnDetails("promo_code", "promo_code", objectSchemaInfo);
        }

        TransaksiModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TransaksiModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TransaksiModelColumnInfo src = (TransaksiModelColumnInfo) rawSrc;
            final TransaksiModelColumnInfo dst = (TransaksiModelColumnInfo) rawDst;
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
            dst.biaya_akhirColKey = src.biaya_akhirColKey;
            dst.total_biayaColKey = src.total_biayaColKey;
            dst.nama_merchantColKey = src.nama_merchantColKey;
            dst.token_merchantColKey = src.token_merchantColKey;
            dst.idtransmerchantColKey = src.idtransmerchantColKey;
            dst.vatColKey = src.vatColKey;
            dst.service_chargeColKey = src.service_chargeColKey;
            dst.discountColKey = src.discountColKey;
            dst.discount_totalColKey = src.discount_totalColKey;
            dst.grand_totalColKey = src.grand_totalColKey;
            dst.delivery_typeColKey = src.delivery_typeColKey;
            dst.sender_nameColKey = src.sender_nameColKey;
            dst.sender_numberColKey = src.sender_numberColKey;
            dst.receiver_nameColKey = src.receiver_nameColKey;
            dst.receiver_numberColKey = src.receiver_numberColKey;
            dst.total_priceColKey = src.total_priceColKey;
            dst.promo_codeColKey = src.promo_codeColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TransaksiModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.TransaksiModel> proxyState;

    com_ourdevelops_ourjek_models_TransaksiModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TransaksiModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.TransaksiModel>(this);
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
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusColKey, value);
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
    public String realmGet$biaya_akhir() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.biaya_akhirColKey);
    }

    @Override
    public void realmSet$biaya_akhir(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.biaya_akhirColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.biaya_akhirColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.biaya_akhirColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.biaya_akhirColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$total_biaya() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.total_biayaColKey);
    }

    @Override
    public void realmSet$total_biaya(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.total_biayaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.total_biayaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.total_biayaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.total_biayaColKey, value);
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
    public String realmGet$token_merchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.token_merchantColKey);
    }

    @Override
    public void realmSet$token_merchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.token_merchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.token_merchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.token_merchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.token_merchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idtransmerchant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idtransmerchantColKey);
    }

    @Override
    public void realmSet$idtransmerchant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idtransmerchantColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idtransmerchantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idtransmerchantColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idtransmerchantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vat() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vatColKey);
    }

    @Override
    public void realmSet$vat(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vatColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.vatColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vatColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vatColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$service_charge() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.service_chargeColKey);
    }

    @Override
    public void realmSet$service_charge(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.service_chargeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.service_chargeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.service_chargeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.service_chargeColKey, value);
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
    public String realmGet$discount_total() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.discount_totalColKey);
    }

    @Override
    public void realmSet$discount_total(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.discount_totalColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.discount_totalColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.discount_totalColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.discount_totalColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$grand_total() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.grand_totalColKey);
    }

    @Override
    public void realmSet$grand_total(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.grand_totalColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.grand_totalColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.grand_totalColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.grand_totalColKey, value);
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

    @Override
    @SuppressWarnings("cast")
    public String realmGet$promo_code() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.promo_codeColKey);
    }

    @Override
    public void realmSet$promo_code(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.promo_codeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.promo_codeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.promo_codeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.promo_codeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TransaksiModel", 42, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
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
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("estimasi", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPengirim", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("teleponPenerima", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("namaBarang", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("biaya_akhir", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("total_biaya", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("nama_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("token_merchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("idtransmerchant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("vat", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("service_charge", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("discount", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("discount_total", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("grand_total", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("delivery_type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sender_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sender_number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("receiver_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("receiver_number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("total_price", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("promo_code", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TransaksiModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TransaksiModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TransaksiModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TransaksiModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.TransaksiModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.TransaksiModel obj = realm.createObjectInternal(com.ourdevelops.ourjek.models.TransaksiModel.class, true, excludeFields);

        final com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
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
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
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
        if (json.has("biaya_akhir")) {
            if (json.isNull("biaya_akhir")) {
                objProxy.realmSet$biaya_akhir(null);
            } else {
                objProxy.realmSet$biaya_akhir((String) json.getString("biaya_akhir"));
            }
        }
        if (json.has("total_biaya")) {
            if (json.isNull("total_biaya")) {
                objProxy.realmSet$total_biaya(null);
            } else {
                objProxy.realmSet$total_biaya((String) json.getString("total_biaya"));
            }
        }
        if (json.has("nama_merchant")) {
            if (json.isNull("nama_merchant")) {
                objProxy.realmSet$nama_merchant(null);
            } else {
                objProxy.realmSet$nama_merchant((String) json.getString("nama_merchant"));
            }
        }
        if (json.has("token_merchant")) {
            if (json.isNull("token_merchant")) {
                objProxy.realmSet$token_merchant(null);
            } else {
                objProxy.realmSet$token_merchant((String) json.getString("token_merchant"));
            }
        }
        if (json.has("idtransmerchant")) {
            if (json.isNull("idtransmerchant")) {
                objProxy.realmSet$idtransmerchant(null);
            } else {
                objProxy.realmSet$idtransmerchant((String) json.getString("idtransmerchant"));
            }
        }
        if (json.has("vat")) {
            if (json.isNull("vat")) {
                objProxy.realmSet$vat(null);
            } else {
                objProxy.realmSet$vat((String) json.getString("vat"));
            }
        }
        if (json.has("service_charge")) {
            if (json.isNull("service_charge")) {
                objProxy.realmSet$service_charge(null);
            } else {
                objProxy.realmSet$service_charge((String) json.getString("service_charge"));
            }
        }
        if (json.has("discount")) {
            if (json.isNull("discount")) {
                objProxy.realmSet$discount(null);
            } else {
                objProxy.realmSet$discount((String) json.getString("discount"));
            }
        }
        if (json.has("discount_total")) {
            if (json.isNull("discount_total")) {
                objProxy.realmSet$discount_total(null);
            } else {
                objProxy.realmSet$discount_total((String) json.getString("discount_total"));
            }
        }
        if (json.has("grand_total")) {
            if (json.isNull("grand_total")) {
                objProxy.realmSet$grand_total(null);
            } else {
                objProxy.realmSet$grand_total((String) json.getString("grand_total"));
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
        if (json.has("promo_code")) {
            if (json.isNull("promo_code")) {
                objProxy.realmSet$promo_code(null);
            } else {
                objProxy.realmSet$promo_code((String) json.getString("promo_code"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.TransaksiModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.ourdevelops.ourjek.models.TransaksiModel obj = new com.ourdevelops.ourjek.models.TransaksiModel();
        final com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) obj;
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
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
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
            } else if (name.equals("biaya_akhir")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$biaya_akhir((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$biaya_akhir(null);
                }
            } else if (name.equals("total_biaya")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$total_biaya((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$total_biaya(null);
                }
            } else if (name.equals("nama_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nama_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nama_merchant(null);
                }
            } else if (name.equals("token_merchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$token_merchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$token_merchant(null);
                }
            } else if (name.equals("idtransmerchant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idtransmerchant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idtransmerchant(null);
                }
            } else if (name.equals("vat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vat((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vat(null);
                }
            } else if (name.equals("service_charge")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$service_charge((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$service_charge(null);
                }
            } else if (name.equals("discount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$discount((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$discount(null);
                }
            } else if (name.equals("discount_total")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$discount_total((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$discount_total(null);
                }
            } else if (name.equals("grand_total")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$grand_total((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$grand_total(null);
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
            } else if (name.equals("promo_code")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$promo_code((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$promo_code(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_ourdevelops_ourjek_models_TransaksiModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.TransaksiModel copyOrUpdate(Realm realm, TransaksiModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.TransaksiModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.TransaksiModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.TransaksiModel copy(Realm realm, TransaksiModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.TransaksiModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.TransaksiModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiModel.class);
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
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.estimasiColKey, realmObjectSource.realmGet$estimasi());
        builder.addString(columnInfo.namaPengirimColKey, realmObjectSource.realmGet$namaPengirim());
        builder.addString(columnInfo.teleponPengirimColKey, realmObjectSource.realmGet$teleponPengirim());
        builder.addString(columnInfo.namaPenerimaColKey, realmObjectSource.realmGet$namaPenerima());
        builder.addString(columnInfo.teleponPenerimaColKey, realmObjectSource.realmGet$teleponPenerima());
        builder.addString(columnInfo.namaBarangColKey, realmObjectSource.realmGet$namaBarang());
        builder.addString(columnInfo.biaya_akhirColKey, realmObjectSource.realmGet$biaya_akhir());
        builder.addString(columnInfo.total_biayaColKey, realmObjectSource.realmGet$total_biaya());
        builder.addString(columnInfo.nama_merchantColKey, realmObjectSource.realmGet$nama_merchant());
        builder.addString(columnInfo.token_merchantColKey, realmObjectSource.realmGet$token_merchant());
        builder.addString(columnInfo.idtransmerchantColKey, realmObjectSource.realmGet$idtransmerchant());
        builder.addString(columnInfo.vatColKey, realmObjectSource.realmGet$vat());
        builder.addString(columnInfo.service_chargeColKey, realmObjectSource.realmGet$service_charge());
        builder.addString(columnInfo.discountColKey, realmObjectSource.realmGet$discount());
        builder.addString(columnInfo.discount_totalColKey, realmObjectSource.realmGet$discount_total());
        builder.addString(columnInfo.grand_totalColKey, realmObjectSource.realmGet$grand_total());
        builder.addString(columnInfo.delivery_typeColKey, realmObjectSource.realmGet$delivery_type());
        builder.addString(columnInfo.sender_nameColKey, realmObjectSource.realmGet$sender_name());
        builder.addString(columnInfo.sender_numberColKey, realmObjectSource.realmGet$sender_number());
        builder.addString(columnInfo.receiver_nameColKey, realmObjectSource.realmGet$receiver_name());
        builder.addString(columnInfo.receiver_numberColKey, realmObjectSource.realmGet$receiver_number());
        builder.addString(columnInfo.total_priceColKey, realmObjectSource.realmGet$total_price());
        builder.addString(columnInfo.promo_codeColKey, realmObjectSource.realmGet$promo_code());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_TransaksiModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.TransaksiModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiModelColumnInfo columnInfo = (TransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        }
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        }
        String realmGet$status = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        }
        String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        }
        String realmGet$biaya_akhir = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$biaya_akhir();
        if (realmGet$biaya_akhir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, realmGet$biaya_akhir, false);
        }
        String realmGet$total_biaya = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_biaya();
        if (realmGet$total_biaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_biayaColKey, colKey, realmGet$total_biaya, false);
        }
        String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$nama_merchant();
        if (realmGet$nama_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
        }
        String realmGet$token_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$token_merchant();
        if (realmGet$token_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.token_merchantColKey, colKey, realmGet$token_merchant, false);
        }
        String realmGet$idtransmerchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idtransmerchant();
        if (realmGet$idtransmerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, realmGet$idtransmerchant, false);
        }
        String realmGet$vat = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$vat();
        if (realmGet$vat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vatColKey, colKey, realmGet$vat, false);
        }
        String realmGet$service_charge = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$service_charge();
        if (realmGet$service_charge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.service_chargeColKey, colKey, realmGet$service_charge, false);
        }
        String realmGet$discount = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount();
        if (realmGet$discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
        }
        String realmGet$discount_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount_total();
        if (realmGet$discount_total != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discount_totalColKey, colKey, realmGet$discount_total, false);
        }
        String realmGet$grand_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$grand_total();
        if (realmGet$grand_total != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.grand_totalColKey, colKey, realmGet$grand_total, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        }
        String realmGet$sender_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_name();
        if (realmGet$sender_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
        }
        String realmGet$sender_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_number();
        if (realmGet$sender_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
        }
        String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
        if (realmGet$receiver_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
        }
        String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
        if (realmGet$receiver_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        }
        String realmGet$promo_code = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$promo_code();
        if (realmGet$promo_code != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_codeColKey, colKey, realmGet$promo_code, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiModelColumnInfo columnInfo = (TransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class);
        com.ourdevelops.ourjek.models.TransaksiModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.TransaksiModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            }
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            }
            String realmGet$status = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            }
            String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            }
            String realmGet$biaya_akhir = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$biaya_akhir();
            if (realmGet$biaya_akhir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, realmGet$biaya_akhir, false);
            }
            String realmGet$total_biaya = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_biaya();
            if (realmGet$total_biaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_biayaColKey, colKey, realmGet$total_biaya, false);
            }
            String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$nama_merchant();
            if (realmGet$nama_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
            }
            String realmGet$token_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$token_merchant();
            if (realmGet$token_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.token_merchantColKey, colKey, realmGet$token_merchant, false);
            }
            String realmGet$idtransmerchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idtransmerchant();
            if (realmGet$idtransmerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, realmGet$idtransmerchant, false);
            }
            String realmGet$vat = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$vat();
            if (realmGet$vat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vatColKey, colKey, realmGet$vat, false);
            }
            String realmGet$service_charge = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$service_charge();
            if (realmGet$service_charge != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.service_chargeColKey, colKey, realmGet$service_charge, false);
            }
            String realmGet$discount = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount();
            if (realmGet$discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
            }
            String realmGet$discount_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount_total();
            if (realmGet$discount_total != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discount_totalColKey, colKey, realmGet$discount_total, false);
            }
            String realmGet$grand_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$grand_total();
            if (realmGet$grand_total != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.grand_totalColKey, colKey, realmGet$grand_total, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            }
            String realmGet$sender_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_name();
            if (realmGet$sender_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
            }
            String realmGet$sender_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_number();
            if (realmGet$sender_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
            }
            String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
            if (realmGet$receiver_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
            }
            String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
            if (realmGet$receiver_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            }
            String realmGet$promo_code = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$promo_code();
            if (realmGet$promo_code != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_codeColKey, colKey, realmGet$promo_code, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.TransaksiModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiModelColumnInfo columnInfo = (TransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long colKey = OsObject.createRow(table);
        cache.put(object, colKey);
        String realmGet$id = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
        }
        String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
        if (realmGet$idPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
        }
        String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idDriver();
        if (realmGet$idDriver != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
        }
        String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
        if (realmGet$orderFitur != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
        java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
        if (realmGet$waktuOrder != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
        }
        java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
        if (realmGet$waktuSelesai != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
        }
        String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
        if (realmGet$alamatAsal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
        }
        String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
        if (realmGet$alamatTujuan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
        }
        String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
        if (realmGet$kodePromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
        }
        String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
        if (realmGet$kreditPromo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
        String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$rate();
        if (realmGet$rate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
        }
        String realmGet$status = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
        }
        String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$estimasi();
        if (realmGet$estimasi != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
        }
        String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
        }
        String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPengirim();
        if (realmGet$teleponPengirim != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
        }
        String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
        }
        String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPenerima();
        if (realmGet$teleponPenerima != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
        }
        String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaBarang();
        if (realmGet$namaBarang != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
        }
        String realmGet$biaya_akhir = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$biaya_akhir();
        if (realmGet$biaya_akhir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, realmGet$biaya_akhir, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, false);
        }
        String realmGet$total_biaya = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_biaya();
        if (realmGet$total_biaya != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_biayaColKey, colKey, realmGet$total_biaya, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.total_biayaColKey, colKey, false);
        }
        String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$nama_merchant();
        if (realmGet$nama_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nama_merchantColKey, colKey, false);
        }
        String realmGet$token_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$token_merchant();
        if (realmGet$token_merchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.token_merchantColKey, colKey, realmGet$token_merchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.token_merchantColKey, colKey, false);
        }
        String realmGet$idtransmerchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idtransmerchant();
        if (realmGet$idtransmerchant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, realmGet$idtransmerchant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, false);
        }
        String realmGet$vat = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$vat();
        if (realmGet$vat != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vatColKey, colKey, realmGet$vat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vatColKey, colKey, false);
        }
        String realmGet$service_charge = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$service_charge();
        if (realmGet$service_charge != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.service_chargeColKey, colKey, realmGet$service_charge, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.service_chargeColKey, colKey, false);
        }
        String realmGet$discount = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount();
        if (realmGet$discount != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.discountColKey, colKey, false);
        }
        String realmGet$discount_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount_total();
        if (realmGet$discount_total != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.discount_totalColKey, colKey, realmGet$discount_total, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.discount_totalColKey, colKey, false);
        }
        String realmGet$grand_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$grand_total();
        if (realmGet$grand_total != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.grand_totalColKey, colKey, realmGet$grand_total, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.grand_totalColKey, colKey, false);
        }
        String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
        if (realmGet$delivery_type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
        }
        String realmGet$sender_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_name();
        if (realmGet$sender_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sender_nameColKey, colKey, false);
        }
        String realmGet$sender_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_number();
        if (realmGet$sender_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sender_numberColKey, colKey, false);
        }
        String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
        if (realmGet$receiver_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.receiver_nameColKey, colKey, false);
        }
        String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
        if (realmGet$receiver_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.receiver_numberColKey, colKey, false);
        }
        String realmGet$total_price = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_price();
        if (realmGet$total_price != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
        }
        String realmGet$promo_code = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$promo_code();
        if (realmGet$promo_code != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.promo_codeColKey, colKey, realmGet$promo_code, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.promo_codeColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.TransaksiModel.class);
        long tableNativePtr = table.getNativePtr();
        TransaksiModelColumnInfo columnInfo = (TransaksiModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.TransaksiModel.class);
        com.ourdevelops.ourjek.models.TransaksiModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.TransaksiModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = OsObject.createRow(table);
            cache.put(object, colKey);
            String realmGet$id = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, colKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, colKey, false);
            }
            String realmGet$idPelanggan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idPelanggan();
            if (realmGet$idPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idPelangganColKey, colKey, realmGet$idPelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idPelangganColKey, colKey, false);
            }
            String realmGet$idDriver = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idDriver();
            if (realmGet$idDriver != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idDriverColKey, colKey, realmGet$idDriver, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idDriverColKey, colKey, false);
            }
            String realmGet$orderFitur = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$orderFitur();
            if (realmGet$orderFitur != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.orderFiturColKey, colKey, realmGet$orderFitur, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.orderFiturColKey, colKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.startLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$startLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLatitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLatitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.endLongitudeColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$endLongitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.jarakColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$jarak(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.hargaColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$harga(), false);
            java.util.Date realmGet$waktuOrder = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuOrder();
            if (realmGet$waktuOrder != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuOrderColKey, colKey, realmGet$waktuOrder.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuOrderColKey, colKey, false);
            }
            java.util.Date realmGet$waktuSelesai = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$waktuSelesai();
            if (realmGet$waktuSelesai != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, realmGet$waktuSelesai.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waktuSelesaiColKey, colKey, false);
            }
            String realmGet$alamatAsal = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatAsal();
            if (realmGet$alamatAsal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatAsalColKey, colKey, realmGet$alamatAsal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatAsalColKey, colKey, false);
            }
            String realmGet$alamatTujuan = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$alamatTujuan();
            if (realmGet$alamatTujuan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, realmGet$alamatTujuan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.alamatTujuanColKey, colKey, false);
            }
            String realmGet$kodePromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kodePromo();
            if (realmGet$kodePromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kodePromoColKey, colKey, realmGet$kodePromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kodePromoColKey, colKey, false);
            }
            String realmGet$kreditPromo = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$kreditPromo();
            if (realmGet$kreditPromo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.kreditPromoColKey, colKey, realmGet$kreditPromo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.kreditPromoColKey, colKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isPakaiWalletColKey, colKey, ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$isPakaiWallet(), false);
            String realmGet$rate = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$rate();
            if (realmGet$rate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.rateColKey, colKey, realmGet$rate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.rateColKey, colKey, false);
            }
            String realmGet$status = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
            }
            String realmGet$estimasi = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$estimasi();
            if (realmGet$estimasi != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.estimasiColKey, colKey, realmGet$estimasi, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.estimasiColKey, colKey, false);
            }
            String realmGet$namaPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPengirim();
            if (realmGet$namaPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPengirimColKey, colKey, realmGet$namaPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPengirimColKey, colKey, false);
            }
            String realmGet$teleponPengirim = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPengirim();
            if (realmGet$teleponPengirim != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, realmGet$teleponPengirim, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPengirimColKey, colKey, false);
            }
            String realmGet$namaPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaPenerima();
            if (realmGet$namaPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, realmGet$namaPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaPenerimaColKey, colKey, false);
            }
            String realmGet$teleponPenerima = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$teleponPenerima();
            if (realmGet$teleponPenerima != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, realmGet$teleponPenerima, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.teleponPenerimaColKey, colKey, false);
            }
            String realmGet$namaBarang = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$namaBarang();
            if (realmGet$namaBarang != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.namaBarangColKey, colKey, realmGet$namaBarang, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.namaBarangColKey, colKey, false);
            }
            String realmGet$biaya_akhir = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$biaya_akhir();
            if (realmGet$biaya_akhir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, realmGet$biaya_akhir, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.biaya_akhirColKey, colKey, false);
            }
            String realmGet$total_biaya = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_biaya();
            if (realmGet$total_biaya != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_biayaColKey, colKey, realmGet$total_biaya, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.total_biayaColKey, colKey, false);
            }
            String realmGet$nama_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$nama_merchant();
            if (realmGet$nama_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nama_merchantColKey, colKey, realmGet$nama_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nama_merchantColKey, colKey, false);
            }
            String realmGet$token_merchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$token_merchant();
            if (realmGet$token_merchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.token_merchantColKey, colKey, realmGet$token_merchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.token_merchantColKey, colKey, false);
            }
            String realmGet$idtransmerchant = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$idtransmerchant();
            if (realmGet$idtransmerchant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, realmGet$idtransmerchant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idtransmerchantColKey, colKey, false);
            }
            String realmGet$vat = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$vat();
            if (realmGet$vat != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vatColKey, colKey, realmGet$vat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vatColKey, colKey, false);
            }
            String realmGet$service_charge = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$service_charge();
            if (realmGet$service_charge != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.service_chargeColKey, colKey, realmGet$service_charge, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.service_chargeColKey, colKey, false);
            }
            String realmGet$discount = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount();
            if (realmGet$discount != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discountColKey, colKey, realmGet$discount, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.discountColKey, colKey, false);
            }
            String realmGet$discount_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$discount_total();
            if (realmGet$discount_total != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.discount_totalColKey, colKey, realmGet$discount_total, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.discount_totalColKey, colKey, false);
            }
            String realmGet$grand_total = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$grand_total();
            if (realmGet$grand_total != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.grand_totalColKey, colKey, realmGet$grand_total, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.grand_totalColKey, colKey, false);
            }
            String realmGet$delivery_type = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$delivery_type();
            if (realmGet$delivery_type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.delivery_typeColKey, colKey, realmGet$delivery_type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.delivery_typeColKey, colKey, false);
            }
            String realmGet$sender_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_name();
            if (realmGet$sender_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_nameColKey, colKey, realmGet$sender_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sender_nameColKey, colKey, false);
            }
            String realmGet$sender_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$sender_number();
            if (realmGet$sender_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sender_numberColKey, colKey, realmGet$sender_number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sender_numberColKey, colKey, false);
            }
            String realmGet$receiver_name = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_name();
            if (realmGet$receiver_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_nameColKey, colKey, realmGet$receiver_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.receiver_nameColKey, colKey, false);
            }
            String realmGet$receiver_number = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$receiver_number();
            if (realmGet$receiver_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.receiver_numberColKey, colKey, realmGet$receiver_number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.receiver_numberColKey, colKey, false);
            }
            String realmGet$total_price = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$total_price();
            if (realmGet$total_price != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.total_priceColKey, colKey, realmGet$total_price, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.total_priceColKey, colKey, false);
            }
            String realmGet$promo_code = ((com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) object).realmGet$promo_code();
            if (realmGet$promo_code != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.promo_codeColKey, colKey, realmGet$promo_code, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.promo_codeColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.TransaksiModel createDetachedCopy(com.ourdevelops.ourjek.models.TransaksiModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.TransaksiModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.TransaksiModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.TransaksiModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.TransaksiModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxyInterface) realmObject;
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
        unmanagedCopy.realmSet$biaya_akhir(realmSource.realmGet$biaya_akhir());
        unmanagedCopy.realmSet$total_biaya(realmSource.realmGet$total_biaya());
        unmanagedCopy.realmSet$nama_merchant(realmSource.realmGet$nama_merchant());
        unmanagedCopy.realmSet$token_merchant(realmSource.realmGet$token_merchant());
        unmanagedCopy.realmSet$idtransmerchant(realmSource.realmGet$idtransmerchant());
        unmanagedCopy.realmSet$vat(realmSource.realmGet$vat());
        unmanagedCopy.realmSet$service_charge(realmSource.realmGet$service_charge());
        unmanagedCopy.realmSet$discount(realmSource.realmGet$discount());
        unmanagedCopy.realmSet$discount_total(realmSource.realmGet$discount_total());
        unmanagedCopy.realmSet$grand_total(realmSource.realmGet$grand_total());
        unmanagedCopy.realmSet$delivery_type(realmSource.realmGet$delivery_type());
        unmanagedCopy.realmSet$sender_name(realmSource.realmGet$sender_name());
        unmanagedCopy.realmSet$sender_number(realmSource.realmGet$sender_number());
        unmanagedCopy.realmSet$receiver_name(realmSource.realmGet$receiver_name());
        unmanagedCopy.realmSet$receiver_number(realmSource.realmGet$receiver_number());
        unmanagedCopy.realmSet$total_price(realmSource.realmGet$total_price());
        unmanagedCopy.realmSet$promo_code(realmSource.realmGet$promo_code());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TransaksiModel = proxy[");
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
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
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
        stringBuilder.append("{biaya_akhir:");
        stringBuilder.append(realmGet$biaya_akhir() != null ? realmGet$biaya_akhir() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{total_biaya:");
        stringBuilder.append(realmGet$total_biaya() != null ? realmGet$total_biaya() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nama_merchant:");
        stringBuilder.append(realmGet$nama_merchant() != null ? realmGet$nama_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{token_merchant:");
        stringBuilder.append(realmGet$token_merchant() != null ? realmGet$token_merchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idtransmerchant:");
        stringBuilder.append(realmGet$idtransmerchant() != null ? realmGet$idtransmerchant() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vat:");
        stringBuilder.append(realmGet$vat() != null ? realmGet$vat() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{service_charge:");
        stringBuilder.append(realmGet$service_charge() != null ? realmGet$service_charge() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{discount:");
        stringBuilder.append(realmGet$discount() != null ? realmGet$discount() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{discount_total:");
        stringBuilder.append(realmGet$discount_total() != null ? realmGet$discount_total() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{grand_total:");
        stringBuilder.append(realmGet$grand_total() != null ? realmGet$grand_total() : "null");
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
        stringBuilder.append(",");
        stringBuilder.append("{promo_code:");
        stringBuilder.append(realmGet$promo_code() != null ? realmGet$promo_code() : "null");
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
        com_ourdevelops_ourjek_models_TransaksiModelRealmProxy aTransaksiModel = (com_ourdevelops_ourjek_models_TransaksiModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTransaksiModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTransaksiModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTransaksiModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
