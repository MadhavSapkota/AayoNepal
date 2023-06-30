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
public class com_ourdevelops_ourjek_models_VehicleModelRealmProxy extends com.ourdevelops.ourjek.models.VehicleModel
    implements RealmObjectProxy, com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface {

    static final class VehicleModelColumnInfo extends ColumnInfo {
        long idColKey;
        long vehicle_category_nameColKey;
        long iconColKey;
        long activeColKey;

        VehicleModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("VehicleModel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.vehicle_category_nameColKey = addColumnDetails("vehicle_category_name", "vehicle_category_name", objectSchemaInfo);
            this.iconColKey = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.activeColKey = addColumnDetails("active", "active", objectSchemaInfo);
        }

        VehicleModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new VehicleModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final VehicleModelColumnInfo src = (VehicleModelColumnInfo) rawSrc;
            final VehicleModelColumnInfo dst = (VehicleModelColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.vehicle_category_nameColKey = src.vehicle_category_nameColKey;
            dst.iconColKey = src.iconColKey;
            dst.activeColKey = src.activeColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private VehicleModelColumnInfo columnInfo;
    private ProxyState<com.ourdevelops.ourjek.models.VehicleModel> proxyState;

    com_ourdevelops_ourjek_models_VehicleModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (VehicleModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.ourdevelops.ourjek.models.VehicleModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$vehicle_category_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.vehicle_category_nameColKey);
    }

    @Override
    public void realmSet$vehicle_category_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.vehicle_category_nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.vehicle_category_nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.vehicle_category_nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.vehicle_category_nameColKey, value);
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
    public long realmGet$active() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.activeColKey);
    }

    @Override
    public void realmSet$active(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.activeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.activeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("VehicleModel", 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("vehicle_category_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("icon", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("active", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VehicleModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new VehicleModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "VehicleModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VehicleModel";
    }

    @SuppressWarnings("cast")
    public static com.ourdevelops.ourjek.models.VehicleModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.ourdevelops.ourjek.models.VehicleModel obj = null;
        if (update) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
            VehicleModelColumnInfo columnInfo = (VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = Table.NO_MATCH;
            if (!json.isNull("id")) {
                colKey = table.findFirstLong(pkColumnKey, json.getLong("id"));
            }
            if (colKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.VehicleModel.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy) realm.createObjectInternal(com.ourdevelops.ourjek.models.VehicleModel.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) obj;
        if (json.has("vehicle_category_name")) {
            if (json.isNull("vehicle_category_name")) {
                objProxy.realmSet$vehicle_category_name(null);
            } else {
                objProxy.realmSet$vehicle_category_name((String) json.getString("vehicle_category_name"));
            }
        }
        if (json.has("icon")) {
            if (json.isNull("icon")) {
                objProxy.realmSet$icon(null);
            } else {
                objProxy.realmSet$icon((String) json.getString("icon"));
            }
        }
        if (json.has("active")) {
            if (json.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            } else {
                objProxy.realmSet$active((long) json.getLong("active"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.ourdevelops.ourjek.models.VehicleModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.ourdevelops.ourjek.models.VehicleModel obj = new com.ourdevelops.ourjek.models.VehicleModel();
        final com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface objProxy = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("vehicle_category_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$vehicle_category_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$vehicle_category_name(null);
                }
            } else if (name.equals("icon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$icon((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$icon(null);
                }
            } else if (name.equals("active")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$active((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
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

    private static com_ourdevelops_ourjek_models_VehicleModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class), false, Collections.<String>emptyList());
        io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy obj = new io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.ourdevelops.ourjek.models.VehicleModel copyOrUpdate(Realm realm, VehicleModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.VehicleModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.ourdevelops.ourjek.models.VehicleModel) cachedRealmObject;
        }

        com.ourdevelops.ourjek.models.VehicleModel realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
            long pkColumnKey = columnInfo.idColKey;
            long colKey = table.findFirstLong(pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
            if (colKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(colKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.ourdevelops.ourjek.models.VehicleModel copy(Realm realm, VehicleModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.VehicleModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.ourdevelops.ourjek.models.VehicleModel) cachedRealmObject;
        }

        com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.vehicle_category_nameColKey, realmObjectSource.realmGet$vehicle_category_name());
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addInteger(columnInfo.activeColKey, realmObjectSource.realmGet$active());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_ourdevelops_ourjek_models_VehicleModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.ourdevelops.ourjek.models.VehicleModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        long tableNativePtr = table.getNativePtr();
        VehicleModelColumnInfo columnInfo = (VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, colKey);
        String realmGet$vehicle_category_name = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$vehicle_category_name();
        if (realmGet$vehicle_category_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, realmGet$vehicle_category_name, false);
        }
        String realmGet$icon = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.activeColKey, colKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$active(), false);
        return colKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        long tableNativePtr = table.getNativePtr();
        VehicleModelColumnInfo columnInfo = (VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.VehicleModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.VehicleModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, colKey);
            String realmGet$vehicle_category_name = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$vehicle_category_name();
            if (realmGet$vehicle_category_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, realmGet$vehicle_category_name, false);
            }
            String realmGet$icon = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.activeColKey, colKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$active(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.ourdevelops.ourjek.models.VehicleModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        long tableNativePtr = table.getNativePtr();
        VehicleModelColumnInfo columnInfo = (VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
        long pkColumnKey = columnInfo.idColKey;
        long colKey = Table.NO_MATCH;
        Object primaryKeyValue = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
        }
        if (colKey == Table.NO_MATCH) {
            colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, colKey);
        String realmGet$vehicle_category_name = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$vehicle_category_name();
        if (realmGet$vehicle_category_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, realmGet$vehicle_category_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, false);
        }
        String realmGet$icon = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.activeColKey, colKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$active(), false);
        return colKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        long tableNativePtr = table.getNativePtr();
        VehicleModelColumnInfo columnInfo = (VehicleModelColumnInfo) realm.getSchema().getColumnInfo(com.ourdevelops.ourjek.models.VehicleModel.class);
        long pkColumnKey = columnInfo.idColKey;
        com.ourdevelops.ourjek.models.VehicleModel object = null;
        while (objects.hasNext()) {
            object = (com.ourdevelops.ourjek.models.VehicleModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long colKey = Table.NO_MATCH;
            Object primaryKeyValue = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                colKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
            }
            if (colKey == Table.NO_MATCH) {
                colKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, colKey);
            String realmGet$vehicle_category_name = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$vehicle_category_name();
            if (realmGet$vehicle_category_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, realmGet$vehicle_category_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.vehicle_category_nameColKey, colKey, false);
            }
            String realmGet$icon = ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$icon();
            if (realmGet$icon != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.iconColKey, colKey, realmGet$icon, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.iconColKey, colKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.activeColKey, colKey, ((com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) object).realmGet$active(), false);
        }
    }

    public static com.ourdevelops.ourjek.models.VehicleModel createDetachedCopy(com.ourdevelops.ourjek.models.VehicleModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.ourdevelops.ourjek.models.VehicleModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.ourdevelops.ourjek.models.VehicleModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.ourdevelops.ourjek.models.VehicleModel) cachedObject.object;
            }
            unmanagedObject = (com.ourdevelops.ourjek.models.VehicleModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface unmanagedCopy = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) unmanagedObject;
        com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface realmSource = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$vehicle_category_name(realmSource.realmGet$vehicle_category_name());
        unmanagedCopy.realmSet$icon(realmSource.realmGet$icon());
        unmanagedCopy.realmSet$active(realmSource.realmGet$active());

        return unmanagedObject;
    }

    static com.ourdevelops.ourjek.models.VehicleModel update(Realm realm, VehicleModelColumnInfo columnInfo, com.ourdevelops.ourjek.models.VehicleModel realmObject, com.ourdevelops.ourjek.models.VehicleModel newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface realmObjectTarget = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) realmObject;
        com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface realmObjectSource = (com_ourdevelops_ourjek_models_VehicleModelRealmProxyInterface) newObject;
        Table table = realm.getTable(com.ourdevelops.ourjek.models.VehicleModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.vehicle_category_nameColKey, realmObjectSource.realmGet$vehicle_category_name());
        builder.addString(columnInfo.iconColKey, realmObjectSource.realmGet$icon());
        builder.addInteger(columnInfo.activeColKey, realmObjectSource.realmGet$active());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("VehicleModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{vehicle_category_name:");
        stringBuilder.append(realmGet$vehicle_category_name() != null ? realmGet$vehicle_category_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{icon:");
        stringBuilder.append(realmGet$icon() != null ? realmGet$icon() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{active:");
        stringBuilder.append(realmGet$active());
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
        com_ourdevelops_ourjek_models_VehicleModelRealmProxy aVehicleModel = (com_ourdevelops_ourjek_models_VehicleModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aVehicleModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aVehicleModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aVehicleModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
