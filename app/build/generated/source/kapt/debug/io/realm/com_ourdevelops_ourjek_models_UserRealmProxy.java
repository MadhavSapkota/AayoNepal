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
public class com_ourdevelops_ourjek_models_UserRealmProxy extends com.ourdevelops.ourjek.models.User
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long idColKey;
        long fullnamaColKey;
        long emailColKey;
        long noTeleponColKey;
        long countrycodeColKey;
        long phoneColKey;
        long passwordColKey;
        long createdOnColKey;
        long tglLahirColKey;
        long fullNamaNpColKey;
        long noTeleponNpColKey;
        long countrycodeNpColKey;
        long phoneNpColKey;
        long tglLahirNpColKey;
        long ratingPelangganColKey;
        long statusColKey;
        long tokenColKey;
        long fotopelangganColKey;
        long showNotiColKey;
        long callStatusColKey;
        long callNoteColKey;
        long otpColKey;
        long appleIdColKey;
        long saldoColKey;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(24);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.fullnamaColKey = addColumnDetails("fullnama", "fullnama", objectSchemaInfo);
            this.emailColKey = addColumnDetails("email", "email", objectSchemaInfo);
            this.noTeleponColKey = addColumnDetails("noTelepon", "noTelepon", objectSchemaInfo);
            this.countrycodeColKey = addColumnDetails("countrycode", "countrycode", objectSchemaInfo);
            this.phoneColKey = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.passwordColKey = addColumnDetails("password", "password", objectSchemaInfo);
            this.createdOnColKey = addColumnDetails("createdOn", "createdOn", objectSchemaInfo);
            this.tglLahirColKey = addColumnDetails("tglLahir", "tglLahir", objectSchemaInfo);
            this.fullNamaNpColKey = addColumnDetails("fullNamaNp", "fullNamaNp", objectSchemaInfo);
            this.noTeleponNpColKey = addColumnDetails("noTeleponNp", "noTeleponNp", objectSchemaInfo);
            this.countrycodeNpColKey = addColumnDetails("countrycodeNp", "countrycodeNp", objectSchemaInfo);
            this.phoneNpColKey = addColumnDetails("phoneNp", "phoneNp", objectSchemaInfo);
            this.tglLahirNpColKey = addColumnDetails("tglLahirNp", "tglLahirNp", objectSchemaInfo);
            this.ratingPelangganColKey = addColumnDetails("ratingPelanggan", "ratingPelanggan", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
            this.tokenColKey = addColumnDetails("token", "token", objectSchemaInfo);
            this.fotopelangganColKey = addColumnDetails("fotopelanggan", "fotopelanggan", objectSchemaInfo);
            this.showNotiColKey = addColumnDetails("showNoti", "showNoti", objectSchemaInfo);
            this.callStatusColKey = addColumnDetails("callStatus", "callStatus", objectSchemaInfo);
            this.callNoteColKey = addColumnDetails("callNote", "callNote", objectSchemaInfo);
            this.otpColKey = addColumnDetails("otp", "otp", objectSchemaInfo);
            this.appleIdColKey = addColumnDetails("appleId", "appleId", objectSchemaInfo);
            this.saldoColKey = addColumnDetails("saldo", "saldo", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.fullnamaColKey = src.fullnamaColKey;
            dst.emailColKey = src.emailColKey;
            dst.noTeleponColKey = src.noTeleponColKey;
            dst.countrycodeColKey = src.countrycodeColKey;
            dst.phoneColKey = src.phoneColKey;
            dst.passwordColKey = src.passwordColKey;
            dst.createdOnColKey = src.createdOnColKey;
            dst.tglLahirColKey = src.tglLahirColKey;
            dst.fullNamaNpColKey = src.fullNamaNpColKey;
            dst.noTeleponNpColKey = src.noTeleponNpColKey;
            dst.countrycodeNpColKey = src.countrycodeNpColKey;
            dst.phoneNpColKey = src.phoneNpColKey;
            dst.tglLahirNpColKey = src.tglLahirNpColKey;
            dst.ratingPelangganColKey = src.ratingPelangganColKey;
            dst.statusColKey = src.statusColKey;
            dst.tokenColKey = src.tokenColKey;
            dst.fotopelangganColKey = src.fotopelangganColKey;
            dst.showNotiColKey = src.showNotiColKey;
            dst.callStatusColKey = src.callStatusColKey;
            dst.callNoteColKey = src.callNoteColKey;
            dst.otpColKey = src.otpColKey;
            dst.appleIdColKey = src.appleIdColKey;
            dst.saldoColKey = src.saldoColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.User> proxyState;

    com_ourdevelops_ourjek_models_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.User>(this);
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
    public String realmGet$fullnama() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fullnamaColKey);
    }

    @Override
    public void realmSet$fullnama(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fullnamaColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fullnamaColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fullnamaColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fullnamaColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailColKey);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailColKey, value);
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
    public String realmGet$countrycode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.countrycodeColKey);
    }

    @Override
    public void realmSet$countrycode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countrycodeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.countrycodeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countrycodeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.countrycodeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneColKey);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordColKey);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$createdOn() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.createdOnColKey);
    }

    @Override
    public void realmSet$createdOn(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.createdOnColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.createdOnColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.createdOnColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.createdOnColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tglLahir() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tglLahirColKey);
    }

    @Override
    public void realmSet$tglLahir(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tglLahirColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tglLahirColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tglLahirColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tglLahirColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fullNamaNp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fullNamaNpColKey);
    }

    @Override
    public void realmSet$fullNamaNp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fullNamaNpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fullNamaNpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fullNamaNpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fullNamaNpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$noTeleponNp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.noTeleponNpColKey);
    }

    @Override
    public void realmSet$noTeleponNp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.noTeleponNpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.noTeleponNpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.noTeleponNpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.noTeleponNpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$countrycodeNp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.countrycodeNpColKey);
    }

    @Override
    public void realmSet$countrycodeNp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.countrycodeNpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.countrycodeNpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.countrycodeNpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.countrycodeNpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phoneNp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneNpColKey);
    }

    @Override
    public void realmSet$phoneNp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneNpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneNpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneNpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneNpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tglLahirNp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tglLahirNpColKey);
    }

    @Override
    public void realmSet$tglLahirNp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tglLahirNpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tglLahirNpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tglLahirNpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tglLahirNpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ratingPelanggan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ratingPelangganColKey);
    }

    @Override
    public void realmSet$ratingPelanggan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ratingPelangganColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ratingPelangganColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ratingPelangganColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ratingPelangganColKey, value);
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
    public String realmGet$token() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tokenColKey);
    }

    @Override
    public void realmSet$token(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tokenColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tokenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tokenColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tokenColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fotopelanggan() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fotopelangganColKey);
    }

    @Override
    public void realmSet$fotopelanggan(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fotopelangganColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fotopelangganColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fotopelangganColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fotopelangganColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$showNoti() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.showNotiColKey);
    }

    @Override
    public void realmSet$showNoti(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.showNotiColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.showNotiColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.showNotiColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.showNotiColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$callStatus() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.callStatusColKey);
    }

    @Override
    public void realmSet$callStatus(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.callStatusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.callStatusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.callStatusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.callStatusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$callNote() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.callNoteColKey);
    }

    @Override
    public void realmSet$callNote(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.callNoteColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.callNoteColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.callNoteColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.callNoteColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$otp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.otpColKey);
    }

    @Override
    public void realmSet$otp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.otpColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.otpColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.otpColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.otpColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$appleId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.appleIdColKey);
    }

    @Override
    public void realmSet$appleId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.appleIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.appleIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.appleIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.appleIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$saldo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.saldoColKey);
    }

    @Override
    public void realmSet$saldo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.saldoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.saldoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.saldoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.saldoColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 24, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fullnama", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("noTelepon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("countrycode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("createdOn", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tglLahir", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fullNamaNp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("noTeleponNp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("countrycodeNp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phoneNp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tglLahirNp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("ratingPelanggan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("token", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fotopelanggan", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("showNoti", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("callStatus", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("callNote", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("otp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("appleId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("saldo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.User obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
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
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_UserRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_UserRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.User.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ourjek_models_UserRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) obj;
        if (json.has("fullnama")) {
            if (json.isNull("fullnama")) {
                objProxy.realmSet$fullnama(null);
            } else {
                objProxy.realmSet$fullnama((String) json.getString("fullnama"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("noTelepon")) {
            if (json.isNull("noTelepon")) {
                objProxy.realmSet$noTelepon(null);
            } else {
                objProxy.realmSet$noTelepon((String) json.getString("noTelepon"));
            }
        }
        if (json.has("countrycode")) {
            if (json.isNull("countrycode")) {
                objProxy.realmSet$countrycode(null);
            } else {
                objProxy.realmSet$countrycode((String) json.getString("countrycode"));
            }
        }
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        if (json.has("createdOn")) {
            if (json.isNull("createdOn")) {
                objProxy.realmSet$createdOn(null);
            } else {
                objProxy.realmSet$createdOn((String) json.getString("createdOn"));
            }
        }
        if (json.has("tglLahir")) {
            if (json.isNull("tglLahir")) {
                objProxy.realmSet$tglLahir(null);
            } else {
                objProxy.realmSet$tglLahir((String) json.getString("tglLahir"));
            }
        }
        if (json.has("fullNamaNp")) {
            if (json.isNull("fullNamaNp")) {
                objProxy.realmSet$fullNamaNp(null);
            } else {
                objProxy.realmSet$fullNamaNp((String) json.getString("fullNamaNp"));
            }
        }
        if (json.has("noTeleponNp")) {
            if (json.isNull("noTeleponNp")) {
                objProxy.realmSet$noTeleponNp(null);
            } else {
                objProxy.realmSet$noTeleponNp((String) json.getString("noTeleponNp"));
            }
        }
        if (json.has("countrycodeNp")) {
            if (json.isNull("countrycodeNp")) {
                objProxy.realmSet$countrycodeNp(null);
            } else {
                objProxy.realmSet$countrycodeNp((String) json.getString("countrycodeNp"));
            }
        }
        if (json.has("phoneNp")) {
            if (json.isNull("phoneNp")) {
                objProxy.realmSet$phoneNp(null);
            } else {
                objProxy.realmSet$phoneNp((String) json.getString("phoneNp"));
            }
        }
        if (json.has("tglLahirNp")) {
            if (json.isNull("tglLahirNp")) {
                objProxy.realmSet$tglLahirNp(null);
            } else {
                objProxy.realmSet$tglLahirNp((String) json.getString("tglLahirNp"));
            }
        }
        if (json.has("ratingPelanggan")) {
            if (json.isNull("ratingPelanggan")) {
                objProxy.realmSet$ratingPelanggan(null);
            } else {
                objProxy.realmSet$ratingPelanggan((String) json.getString("ratingPelanggan"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("token")) {
            if (json.isNull("token")) {
                objProxy.realmSet$token(null);
            } else {
                objProxy.realmSet$token((String) json.getString("token"));
            }
        }
        if (json.has("fotopelanggan")) {
            if (json.isNull("fotopelanggan")) {
                objProxy.realmSet$fotopelanggan(null);
            } else {
                objProxy.realmSet$fotopelanggan((String) json.getString("fotopelanggan"));
            }
        }
        if (json.has("showNoti")) {
            if (json.isNull("showNoti")) {
                objProxy.realmSet$showNoti(null);
            } else {
                objProxy.realmSet$showNoti((String) json.getString("showNoti"));
            }
        }
        if (json.has("callStatus")) {
            if (json.isNull("callStatus")) {
                objProxy.realmSet$callStatus(null);
            } else {
                objProxy.realmSet$callStatus((String) json.getString("callStatus"));
            }
        }
        if (json.has("callNote")) {
            if (json.isNull("callNote")) {
                objProxy.realmSet$callNote(null);
            } else {
                objProxy.realmSet$callNote((String) json.getString("callNote"));
            }
        }
        if (json.has("otp")) {
            if (json.isNull("otp")) {
                objProxy.realmSet$otp(null);
            } else {
                objProxy.realmSet$otp((String) json.getString("otp"));
            }
        }
        if (json.has("appleId")) {
            if (json.isNull("appleId")) {
                objProxy.realmSet$appleId(null);
            } else {
                objProxy.realmSet$appleId((String) json.getString("appleId"));
            }
        }
        if (json.has("saldo")) {
            if (json.isNull("saldo")) {
                objProxy.realmSet$saldo(null);
            } else {
                objProxy.realmSet$saldo((String) json.getString("saldo"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.User obj = new com.ourdevelops.ourjek.models.User();
        final com_ourdevelops_ourjek_models_UserRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) obj;
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
            } else if (name.equals("fullnama")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fullnama((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fullnama(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("noTelepon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$noTelepon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$noTelepon(null);
                }
            } else if (name.equals("countrycode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$countrycode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$countrycode(null);
                }
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else if (name.equals("createdOn")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$createdOn((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$createdOn(null);
                }
            } else if (name.equals("tglLahir")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tglLahir((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tglLahir(null);
                }
            } else if (name.equals("fullNamaNp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fullNamaNp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fullNamaNp(null);
                }
            } else if (name.equals("noTeleponNp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$noTeleponNp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$noTeleponNp(null);
                }
            } else if (name.equals("countrycodeNp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$countrycodeNp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$countrycodeNp(null);
                }
            } else if (name.equals("phoneNp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNp(null);
                }
            } else if (name.equals("tglLahirNp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tglLahirNp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tglLahirNp(null);
                }
            } else if (name.equals("ratingPelanggan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ratingPelanggan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ratingPelanggan(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("token")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$token((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$token(null);
                }
            } else if (name.equals("fotopelanggan")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fotopelanggan((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fotopelanggan(null);
                }
            } else if (name.equals("showNoti")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$showNoti((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$showNoti(null);
                }
            } else if (name.equals("callStatus")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$callStatus((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$callStatus(null);
                }
            } else if (name.equals("callNote")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$callNote((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$callNote(null);
                }
            } else if (name.equals("otp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$otp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$otp(null);
                }
            } else if (name.equals("appleId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$appleId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$appleId(null);
                }
            } else if (name.equals("saldo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$saldo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$saldo(null);
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

    private static com_ourdevelops_ourjek_models_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_UserRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ourjek.models.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.User) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$id();
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
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.User copy(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ourjek.models.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.User) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_UserRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.fullnamaColKey, realmObjectSource.realmGet$fullnama());
        builder.addString(columnInfo.emailColKey, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.countrycodeColKey, realmObjectSource.realmGet$countrycode());
        builder.addString(columnInfo.phoneColKey, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.createdOnColKey, realmObjectSource.realmGet$createdOn());
        builder.addString(columnInfo.tglLahirColKey, realmObjectSource.realmGet$tglLahir());
        builder.addString(columnInfo.fullNamaNpColKey, realmObjectSource.realmGet$fullNamaNp());
        builder.addString(columnInfo.noTeleponNpColKey, realmObjectSource.realmGet$noTeleponNp());
        builder.addString(columnInfo.countrycodeNpColKey, realmObjectSource.realmGet$countrycodeNp());
        builder.addString(columnInfo.phoneNpColKey, realmObjectSource.realmGet$phoneNp());
        builder.addString(columnInfo.tglLahirNpColKey, realmObjectSource.realmGet$tglLahirNp());
        builder.addString(columnInfo.ratingPelangganColKey, realmObjectSource.realmGet$ratingPelanggan());
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.tokenColKey, realmObjectSource.realmGet$token());
        builder.addString(columnInfo.fotopelangganColKey, realmObjectSource.realmGet$fotopelanggan());
        builder.addString(columnInfo.showNotiColKey, realmObjectSource.realmGet$showNoti());
        builder.addString(columnInfo.callStatusColKey, realmObjectSource.realmGet$callStatus());
        builder.addString(columnInfo.callNoteColKey, realmObjectSource.realmGet$callNote());
        builder.addString(columnInfo.otpColKey, realmObjectSource.realmGet$otp());
        builder.addString(columnInfo.appleIdColKey, realmObjectSource.realmGet$appleId());
        builder.addString(columnInfo.saldoColKey, realmObjectSource.realmGet$saldo());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_UserRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$id();
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
        String realmGet$fullnama = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullnama();
        if (realmGet$fullnama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
        }
        String realmGet$email = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        }
        String realmGet$countrycode = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycode();
        if (realmGet$countrycode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
        }
        String realmGet$phone = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
        }
        String realmGet$password = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
        }
        String realmGet$createdOn = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$createdOn();
        if (realmGet$createdOn != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdOnColKey, colKey, realmGet$createdOn, false);
        }
        String realmGet$tglLahir = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahir();
        if (realmGet$tglLahir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglLahirColKey, colKey, realmGet$tglLahir, false);
        }
        String realmGet$fullNamaNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullNamaNp();
        if (realmGet$fullNamaNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, realmGet$fullNamaNp, false);
        }
        String realmGet$noTeleponNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTeleponNp();
        if (realmGet$noTeleponNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, realmGet$noTeleponNp, false);
        }
        String realmGet$countrycodeNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycodeNp();
        if (realmGet$countrycodeNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, realmGet$countrycodeNp, false);
        }
        String realmGet$phoneNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phoneNp();
        if (realmGet$phoneNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNpColKey, colKey, realmGet$phoneNp, false);
        }
        String realmGet$tglLahirNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahirNp();
        if (realmGet$tglLahirNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, realmGet$tglLahirNp, false);
        }
        String realmGet$ratingPelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$ratingPelanggan();
        if (realmGet$ratingPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, realmGet$ratingPelanggan, false);
        }
        String realmGet$status = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        }
        String realmGet$token = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
        }
        String realmGet$fotopelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fotopelanggan();
        if (realmGet$fotopelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fotopelangganColKey, colKey, realmGet$fotopelanggan, false);
        }
        String realmGet$showNoti = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$showNoti();
        if (realmGet$showNoti != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.showNotiColKey, colKey, realmGet$showNoti, false);
        }
        String realmGet$callStatus = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callStatus();
        if (realmGet$callStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.callStatusColKey, colKey, realmGet$callStatus, false);
        }
        String realmGet$callNote = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callNote();
        if (realmGet$callNote != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.callNoteColKey, colKey, realmGet$callNote, false);
        }
        String realmGet$otp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$otp();
        if (realmGet$otp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.otpColKey, colKey, realmGet$otp, false);
        }
        String realmGet$appleId = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$appleId();
        if (realmGet$appleId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.appleIdColKey, colKey, realmGet$appleId, false);
        }
        String realmGet$saldo = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$saldo();
        if (realmGet$saldo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.saldoColKey, colKey, realmGet$saldo, false);
        }
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.User object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$id();
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
            String realmGet$fullnama = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullnama();
            if (realmGet$fullnama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
            }
            String realmGet$email = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            }
            String realmGet$countrycode = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycode();
            if (realmGet$countrycode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
            }
            String realmGet$phone = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
            }
            String realmGet$password = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
            }
            String realmGet$createdOn = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$createdOn();
            if (realmGet$createdOn != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdOnColKey, colKey, realmGet$createdOn, false);
            }
            String realmGet$tglLahir = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahir();
            if (realmGet$tglLahir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglLahirColKey, colKey, realmGet$tglLahir, false);
            }
            String realmGet$fullNamaNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullNamaNp();
            if (realmGet$fullNamaNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, realmGet$fullNamaNp, false);
            }
            String realmGet$noTeleponNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTeleponNp();
            if (realmGet$noTeleponNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, realmGet$noTeleponNp, false);
            }
            String realmGet$countrycodeNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycodeNp();
            if (realmGet$countrycodeNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, realmGet$countrycodeNp, false);
            }
            String realmGet$phoneNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phoneNp();
            if (realmGet$phoneNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNpColKey, colKey, realmGet$phoneNp, false);
            }
            String realmGet$tglLahirNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahirNp();
            if (realmGet$tglLahirNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, realmGet$tglLahirNp, false);
            }
            String realmGet$ratingPelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$ratingPelanggan();
            if (realmGet$ratingPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, realmGet$ratingPelanggan, false);
            }
            String realmGet$status = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            }
            String realmGet$token = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
            }
            String realmGet$fotopelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fotopelanggan();
            if (realmGet$fotopelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fotopelangganColKey, colKey, realmGet$fotopelanggan, false);
            }
            String realmGet$showNoti = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$showNoti();
            if (realmGet$showNoti != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.showNotiColKey, colKey, realmGet$showNoti, false);
            }
            String realmGet$callStatus = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callStatus();
            if (realmGet$callStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.callStatusColKey, colKey, realmGet$callStatus, false);
            }
            String realmGet$callNote = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callNote();
            if (realmGet$callNote != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.callNoteColKey, colKey, realmGet$callNote, false);
            }
            String realmGet$otp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$otp();
            if (realmGet$otp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.otpColKey, colKey, realmGet$otp, false);
            }
            String realmGet$appleId = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$appleId();
            if (realmGet$appleId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.appleIdColKey, colKey, realmGet$appleId, false);
            }
            String realmGet$saldo = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$saldo();
            if (realmGet$saldo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.saldoColKey, colKey, realmGet$saldo, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$id();
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
        String realmGet$fullnama = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullnama();
        if (realmGet$fullnama != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fullnamaColKey, colKey, false);
        }
        String realmGet$email = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, colKey, false);
        }
        String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTelepon();
        if (realmGet$noTelepon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
        }
        String realmGet$countrycode = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycode();
        if (realmGet$countrycode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeColKey, colKey, false);
        }
        String realmGet$phone = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, colKey, false);
        }
        String realmGet$password = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, colKey, false);
        }
        String realmGet$createdOn = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$createdOn();
        if (realmGet$createdOn != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdOnColKey, colKey, realmGet$createdOn, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdOnColKey, colKey, false);
        }
        String realmGet$tglLahir = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahir();
        if (realmGet$tglLahir != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglLahirColKey, colKey, realmGet$tglLahir, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tglLahirColKey, colKey, false);
        }
        String realmGet$fullNamaNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullNamaNp();
        if (realmGet$fullNamaNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, realmGet$fullNamaNp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, false);
        }
        String realmGet$noTeleponNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTeleponNp();
        if (realmGet$noTeleponNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, realmGet$noTeleponNp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, false);
        }
        String realmGet$countrycodeNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycodeNp();
        if (realmGet$countrycodeNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, realmGet$countrycodeNp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, false);
        }
        String realmGet$phoneNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phoneNp();
        if (realmGet$phoneNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNpColKey, colKey, realmGet$phoneNp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNpColKey, colKey, false);
        }
        String realmGet$tglLahirNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahirNp();
        if (realmGet$tglLahirNp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, realmGet$tglLahirNp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, false);
        }
        String realmGet$ratingPelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$ratingPelanggan();
        if (realmGet$ratingPelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, realmGet$ratingPelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, false);
        }
        String realmGet$status = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
        }
        String realmGet$token = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tokenColKey, colKey, false);
        }
        String realmGet$fotopelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fotopelanggan();
        if (realmGet$fotopelanggan != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fotopelangganColKey, colKey, realmGet$fotopelanggan, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fotopelangganColKey, colKey, false);
        }
        String realmGet$showNoti = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$showNoti();
        if (realmGet$showNoti != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.showNotiColKey, colKey, realmGet$showNoti, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.showNotiColKey, colKey, false);
        }
        String realmGet$callStatus = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callStatus();
        if (realmGet$callStatus != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.callStatusColKey, colKey, realmGet$callStatus, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.callStatusColKey, colKey, false);
        }
        String realmGet$callNote = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callNote();
        if (realmGet$callNote != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.callNoteColKey, colKey, realmGet$callNote, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.callNoteColKey, colKey, false);
        }
        String realmGet$otp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$otp();
        if (realmGet$otp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.otpColKey, colKey, realmGet$otp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.otpColKey, colKey, false);
        }
        String realmGet$appleId = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$appleId();
        if (realmGet$appleId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.appleIdColKey, colKey, realmGet$appleId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.appleIdColKey, colKey, false);
        }
        String realmGet$saldo = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$saldo();
        if (realmGet$saldo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.saldoColKey, colKey, realmGet$saldo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.saldoColKey, colKey, false);
        }
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.User.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.User object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$id();
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
            String realmGet$fullnama = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullnama();
            if (realmGet$fullnama != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullnamaColKey, colKey, realmGet$fullnama, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fullnamaColKey, colKey, false);
            }
            String realmGet$email = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, colKey, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, colKey, false);
            }
            String realmGet$noTelepon = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTelepon();
            if (realmGet$noTelepon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponColKey, colKey, realmGet$noTelepon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponColKey, colKey, false);
            }
            String realmGet$countrycode = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycode();
            if (realmGet$countrycode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeColKey, colKey, realmGet$countrycode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeColKey, colKey, false);
            }
            String realmGet$phone = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, colKey, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, colKey, false);
            }
            String realmGet$password = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordColKey, colKey, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordColKey, colKey, false);
            }
            String realmGet$createdOn = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$createdOn();
            if (realmGet$createdOn != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdOnColKey, colKey, realmGet$createdOn, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.createdOnColKey, colKey, false);
            }
            String realmGet$tglLahir = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahir();
            if (realmGet$tglLahir != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglLahirColKey, colKey, realmGet$tglLahir, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tglLahirColKey, colKey, false);
            }
            String realmGet$fullNamaNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fullNamaNp();
            if (realmGet$fullNamaNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, realmGet$fullNamaNp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fullNamaNpColKey, colKey, false);
            }
            String realmGet$noTeleponNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$noTeleponNp();
            if (realmGet$noTeleponNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, realmGet$noTeleponNp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.noTeleponNpColKey, colKey, false);
            }
            String realmGet$countrycodeNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$countrycodeNp();
            if (realmGet$countrycodeNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, realmGet$countrycodeNp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.countrycodeNpColKey, colKey, false);
            }
            String realmGet$phoneNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$phoneNp();
            if (realmGet$phoneNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNpColKey, colKey, realmGet$phoneNp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNpColKey, colKey, false);
            }
            String realmGet$tglLahirNp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$tglLahirNp();
            if (realmGet$tglLahirNp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, realmGet$tglLahirNp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tglLahirNpColKey, colKey, false);
            }
            String realmGet$ratingPelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$ratingPelanggan();
            if (realmGet$ratingPelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, realmGet$ratingPelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ratingPelangganColKey, colKey, false);
            }
            String realmGet$status = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, colKey, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, colKey, false);
            }
            String realmGet$token = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$token();
            if (realmGet$token != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tokenColKey, colKey, realmGet$token, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tokenColKey, colKey, false);
            }
            String realmGet$fotopelanggan = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$fotopelanggan();
            if (realmGet$fotopelanggan != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fotopelangganColKey, colKey, realmGet$fotopelanggan, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fotopelangganColKey, colKey, false);
            }
            String realmGet$showNoti = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$showNoti();
            if (realmGet$showNoti != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.showNotiColKey, colKey, realmGet$showNoti, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.showNotiColKey, colKey, false);
            }
            String realmGet$callStatus = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callStatus();
            if (realmGet$callStatus != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.callStatusColKey, colKey, realmGet$callStatus, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.callStatusColKey, colKey, false);
            }
            String realmGet$callNote = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$callNote();
            if (realmGet$callNote != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.callNoteColKey, colKey, realmGet$callNote, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.callNoteColKey, colKey, false);
            }
            String realmGet$otp = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$otp();
            if (realmGet$otp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.otpColKey, colKey, realmGet$otp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.otpColKey, colKey, false);
            }
            String realmGet$appleId = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$appleId();
            if (realmGet$appleId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.appleIdColKey, colKey, realmGet$appleId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.appleIdColKey, colKey, false);
            }
            String realmGet$saldo = ((com_ourdevelops_ourjek_models_UserRealmProxyInterface) object).realmGet$saldo();
            if (realmGet$saldo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.saldoColKey, colKey, realmGet$saldo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.saldoColKey, colKey, false);
            }
        }
    }

    public static com.ourdevelops.ourjek.models.User createDetachedCopy(com.ourdevelops.ourjek.models.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.User) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_UserRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_UserRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$fullnama(realmSource.realmGet$fullnama());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$noTelepon(realmSource.realmGet$noTelepon());
        unmanagedCopy.realmSet$countrycode(realmSource.realmGet$countrycode());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());
        unmanagedCopy.realmSet$createdOn(realmSource.realmGet$createdOn());
        unmanagedCopy.realmSet$tglLahir(realmSource.realmGet$tglLahir());
        unmanagedCopy.realmSet$fullNamaNp(realmSource.realmGet$fullNamaNp());
        unmanagedCopy.realmSet$noTeleponNp(realmSource.realmGet$noTeleponNp());
        unmanagedCopy.realmSet$countrycodeNp(realmSource.realmGet$countrycodeNp());
        unmanagedCopy.realmSet$phoneNp(realmSource.realmGet$phoneNp());
        unmanagedCopy.realmSet$tglLahirNp(realmSource.realmGet$tglLahirNp());
        unmanagedCopy.realmSet$ratingPelanggan(realmSource.realmGet$ratingPelanggan());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$token(realmSource.realmGet$token());
        unmanagedCopy.realmSet$fotopelanggan(realmSource.realmGet$fotopelanggan());
        unmanagedCopy.realmSet$showNoti(realmSource.realmGet$showNoti());
        unmanagedCopy.realmSet$callStatus(realmSource.realmGet$callStatus());
        unmanagedCopy.realmSet$callNote(realmSource.realmGet$callNote());
        unmanagedCopy.realmSet$otp(realmSource.realmGet$otp());
        unmanagedCopy.realmSet$appleId(realmSource.realmGet$appleId());
        unmanagedCopy.realmSet$saldo(realmSource.realmGet$saldo());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.User update(Realm realm, UserColumnInfo columnInfo, com.ourdevelops.ourjek.models.User realmObject, com.ourdevelops.ourjek.models.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_UserRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_UserRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.fullnamaColKey, realmObjectSource.realmGet$fullnama());
        builder.addString(columnInfo.emailColKey, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.noTeleponColKey, realmObjectSource.realmGet$noTelepon());
        builder.addString(columnInfo.countrycodeColKey, realmObjectSource.realmGet$countrycode());
        builder.addString(columnInfo.phoneColKey, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.passwordColKey, realmObjectSource.realmGet$password());
        builder.addString(columnInfo.createdOnColKey, realmObjectSource.realmGet$createdOn());
        builder.addString(columnInfo.tglLahirColKey, realmObjectSource.realmGet$tglLahir());
        builder.addString(columnInfo.fullNamaNpColKey, realmObjectSource.realmGet$fullNamaNp());
        builder.addString(columnInfo.noTeleponNpColKey, realmObjectSource.realmGet$noTeleponNp());
        builder.addString(columnInfo.countrycodeNpColKey, realmObjectSource.realmGet$countrycodeNp());
        builder.addString(columnInfo.phoneNpColKey, realmObjectSource.realmGet$phoneNp());
        builder.addString(columnInfo.tglLahirNpColKey, realmObjectSource.realmGet$tglLahirNp());
        builder.addString(columnInfo.ratingPelangganColKey, realmObjectSource.realmGet$ratingPelanggan());
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.tokenColKey, realmObjectSource.realmGet$token());
        builder.addString(columnInfo.fotopelangganColKey, realmObjectSource.realmGet$fotopelanggan());
        builder.addString(columnInfo.showNotiColKey, realmObjectSource.realmGet$showNoti());
        builder.addString(columnInfo.callStatusColKey, realmObjectSource.realmGet$callStatus());
        builder.addString(columnInfo.callNoteColKey, realmObjectSource.realmGet$callNote());
        builder.addString(columnInfo.otpColKey, realmObjectSource.realmGet$otp());
        builder.addString(columnInfo.appleIdColKey, realmObjectSource.realmGet$appleId());
        builder.addString(columnInfo.saldoColKey, realmObjectSource.realmGet$saldo());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fullnama:");
        stringBuilder.append(realmGet$fullnama() != null ? realmGet$fullnama() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{noTelepon:");
        stringBuilder.append(realmGet$noTelepon() != null ? realmGet$noTelepon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{countrycode:");
        stringBuilder.append(realmGet$countrycode() != null ? realmGet$countrycode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone:");
        stringBuilder.append(realmGet$phone() != null ? realmGet$phone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createdOn:");
        stringBuilder.append(realmGet$createdOn() != null ? realmGet$createdOn() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tglLahir:");
        stringBuilder.append(realmGet$tglLahir() != null ? realmGet$tglLahir() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fullNamaNp:");
        stringBuilder.append(realmGet$fullNamaNp() != null ? realmGet$fullNamaNp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{noTeleponNp:");
        stringBuilder.append(realmGet$noTeleponNp() != null ? realmGet$noTeleponNp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{countrycodeNp:");
        stringBuilder.append(realmGet$countrycodeNp() != null ? realmGet$countrycodeNp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phoneNp:");
        stringBuilder.append(realmGet$phoneNp() != null ? realmGet$phoneNp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tglLahirNp:");
        stringBuilder.append(realmGet$tglLahirNp() != null ? realmGet$tglLahirNp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ratingPelanggan:");
        stringBuilder.append(realmGet$ratingPelanggan() != null ? realmGet$ratingPelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{token:");
        stringBuilder.append(realmGet$token() != null ? realmGet$token() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fotopelanggan:");
        stringBuilder.append(realmGet$fotopelanggan() != null ? realmGet$fotopelanggan() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{showNoti:");
        stringBuilder.append(realmGet$showNoti() != null ? realmGet$showNoti() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{callStatus:");
        stringBuilder.append(realmGet$callStatus() != null ? realmGet$callStatus() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{callNote:");
        stringBuilder.append(realmGet$callNote() != null ? realmGet$callNote() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{otp:");
        stringBuilder.append(realmGet$otp() != null ? realmGet$otp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{appleId:");
        stringBuilder.append(realmGet$appleId() != null ? realmGet$appleId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{saldo:");
        stringBuilder.append(realmGet$saldo() != null ? realmGet$saldo() : "null");
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
        com_ourdevelops_ourjek_models_UserRealmProxy aUser = (com_ourdevelops_ourjek_models_UserRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUser.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUser.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUser.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
