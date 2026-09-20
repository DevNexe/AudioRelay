package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.SjP;
import com.google.android.gms.internal.measurement.Xn1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iy5 extends g27 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final cy5 d;
    public final zk e;

    public iy5(r27 r27Var) {
        super(r27Var);
        this.e = new zk(this.a.n);
        this.a.getClass();
        this.d = new cy5(this, this.a.a);
    }

    public static final void r(ContentValues contentValues, Object obj) {
        oa3.e("value");
        oa3.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final tx5 A(long j2, String str, boolean z, boolean z2) {
        return B(j2, str, 1L, false, false, z, false, z2);
    }

    public final tx5 B(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        dq6 dq6Var = this.a;
        oa3.e(str);
        e();
        f();
        String[] strArr = {str};
        tx5 tx5Var = new tx5();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                Cursor cursorQuery = sQLiteDatabaseX.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.i.c(bi6.n(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return tx5Var;
                }
                if (cursorQuery.getLong(0) == j2) {
                    tx5Var.b = cursorQuery.getLong(1);
                    tx5Var.a = cursorQuery.getLong(2);
                    tx5Var.c = cursorQuery.getLong(3);
                    tx5Var.d = cursorQuery.getLong(4);
                    tx5Var.e = cursorQuery.getLong(5);
                }
                if (z) {
                    tx5Var.b += j3;
                }
                if (z2) {
                    tx5Var.a += j3;
                }
                if (z3) {
                    tx5Var.c += j3;
                }
                if (z4) {
                    tx5Var.d += j3;
                }
                if (z5) {
                    tx5Var.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(tx5Var.a));
                contentValues.put("daily_events_count", Long.valueOf(tx5Var.b));
                contentValues.put("daily_conversions_count", Long.valueOf(tx5Var.c));
                contentValues.put("daily_error_events_count", Long.valueOf(tx5Var.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(tx5Var.e));
                sQLiteDatabaseX.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return tx5Var;
            } catch (SQLiteException e) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.d(bi6.n(str), "Error updating daily counts. appId", e);
                if (0 != 0) {
                    cursor.close();
                }
                return tx5Var;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x014b  */
    public final xz5 C(String str, String str2) throws Throwable {
        dq6 dq6Var;
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        dq6 dq6Var2 = this.a;
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = x().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j2 = cursorQuery.getLong(0);
                long j3 = cursorQuery.getLong(1);
                long j4 = cursorQuery.getLong(2);
                long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                dq6Var = dq6Var2;
                cursor2 = cursorQuery;
                try {
                    xz5 xz5Var = new xz5(str, str2, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.c(bi6.n(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursor2.close();
                    return xz5Var;
                } catch (SQLiteException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                dq6Var = dq6Var2;
                cursor2 = cursorQuery;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e3) {
            e = e3;
            dq6Var = dq6Var2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.e("Error querying events. appId", bi6.n(str), dq6Var.m.d(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final h37 D(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        dq6 dq6Var = this.a;
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        Cursor cursor = null;
        try {
            cursorQuery = x().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j2 = cursorQuery.getLong(0);
                    Object objE = E(cursorQuery, 1);
                    if (objE == null) {
                        cursorQuery.close();
                        return null;
                    }
                    h37 h37Var = new h37(str, cursorQuery.getString(2), str2, j2, objE);
                    if (cursorQuery.moveToNext()) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.c(bi6.n(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return h37Var;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                }
            } catch (SQLiteException e) {
                e = e;
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.e("Error querying user property. appId", bi6.n(str), dq6Var.m.f(str2), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final Object E(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        dq6 dq6Var = this.a;
        if (type == 0) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type == 4) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.b("Loaded invalid blob type value, ignoring it");
            return null;
        }
        bi6 bi6Var3 = dq6Var.i;
        dq6.h(bi6Var3);
        bi6Var3.f.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String F() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseX = x();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseX.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    bi6 bi6Var = this.a.i;
                    dq6.h(bi6Var);
                    bi6Var.f.c(e, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            r1 = sQLiteDatabaseX;
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public final List G(String str, String str2, String str3) {
        oa3.e(str);
        e();
        f();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return H(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List H(String str, String[] strArr) {
        r27 r27Var = this.b;
        dq6 dq6Var = this.a;
        e();
        f();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                String[] strArr2 = {"app_id", "origin", MediationMetaData.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                dq6Var.getClass();
                cursorQuery = sQLiteDatabaseX.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objE = E(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j2 = cursorQuery.getLong(6);
                    b37 b37Var = r27Var.g;
                    b37 b37Var2 = r27Var.g;
                    r27.E(b37Var);
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<m16> creator = m16.CREATOR;
                    m16 m16Var = (m16) b37Var.u(blob, creator);
                    long j3 = cursorQuery.getLong(8);
                    r27.E(b37Var2);
                    m16 m16Var2 = (m16) b37Var2.u(cursorQuery.getBlob(9), creator);
                    long j4 = cursorQuery.getLong(10);
                    long j5 = cursorQuery.getLong(11);
                    r27.E(b37Var2);
                    arrayList.add(new ft5(string, string2, new d37(j4, objE, string3, string2), j3, z, string4, m16Var, j2, m16Var2, j5, (m16) b37Var2.u(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.f.c(Integer.valueOf(AdError.NETWORK_ERROR_CODE), "Read more than the max allowed conditional properties, ignoring extra");
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c(e, "Error querying conditional user property value");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final List I(String str) {
        dq6 dq6Var = this.a;
        oa3.e(str);
        e();
        f();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                dq6Var.getClass();
                cursorQuery = x().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j2 = cursorQuery.getLong(2);
                    Object objE = E(cursorQuery, 3);
                    if (objE == null) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.c(bi6.n(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new h37(str, str2, string, j2, objE));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.d(bi6.n(str), "Error querying user properties. appId", e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    public final List J(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        String string;
        dq6 dq6Var = this.a;
        oa3.e(str);
        e();
        f();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                        sb.append(" and origin=?");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabaseX = x();
                    String[] strArr2 = {MediationMetaData.KEY_NAME, "set_timestamp", "value", "origin"};
                    String string2 = sb.toString();
                    dq6Var.getClass();
                    cursorQuery = sQLiteDatabaseX.query("user_attributes", strArr2, string2, strArr, null, null, "rowid", "1001");
                    try {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            string = str2;
                            do {
                                try {
                                    int size = arrayList.size();
                                    bi6 bi6Var = dq6Var.i;
                                    if (size >= 1000) {
                                        dq6.h(bi6Var);
                                        bi6Var.f.c(Integer.valueOf(AdError.NETWORK_ERROR_CODE), "Read more than the max allowed user properties, ignoring excess");
                                        break;
                                    }
                                    String string3 = cursorQuery.getString(0);
                                    long j2 = cursorQuery.getLong(1);
                                    Object objE = E(cursorQuery, 2);
                                    string = cursorQuery.getString(3);
                                    if (objE == null) {
                                        dq6.h(bi6Var);
                                        bi6Var.f.e("(2)Read invalid user property value, ignoring it", bi6.n(str), string, str3);
                                    } else {
                                        arrayList.add(new h37(str, string, string3, j2, objE));
                                    }
                                } catch (SQLiteException e) {
                                    e = e;
                                    bi6 bi6Var2 = dq6Var.i;
                                    dq6.h(bi6Var2);
                                    bi6Var2.f.e("(2)Error querying user properties", bi6.n(str), string, e);
                                    List listEmptyList = Collections.emptyList();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return listEmptyList;
                                }
                            } while (cursorQuery.moveToNext());
                            cursorQuery.close();
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        string = str2;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    string = str2;
                    cursorQuery = null;
                    bi6 bi6Var3 = dq6Var.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.e("(2)Error querying user properties", bi6.n(str), string, e);
                    List listEmptyList2 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList2;
                }
            } catch (SQLiteException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void K() {
        f();
        x().beginTransaction();
    }

    public final void L() {
        f();
        x().endTransaction();
    }

    public final void M(List list) {
        e();
        f();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (m()) {
            String strA = fc2.a("(", TextUtils.join(",", list), ")");
            long jS = s("SELECT COUNT(1) FROM queue WHERE rowid IN " + strA + " AND retry_count =  2147483647 LIMIT 1", null);
            dq6 dq6Var = this.a;
            if (jS > 0) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                x().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strA + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void N() {
        e();
        f();
        if (m()) {
            r27 r27Var = this.b;
            long jA = r27Var.i.e.a();
            dq6 dq6Var = this.a;
            dq6Var.n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) lg6.z.a(null)).longValue()) {
                r27Var.i.e.b(jElapsedRealtime);
                e();
                f();
                if (m()) {
                    SQLiteDatabase sQLiteDatabaseX = x();
                    dq6Var.n.getClass();
                    int iDelete = sQLiteDatabaseX.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) lg6.E.a(null)).longValue())});
                    if (iDelete > 0) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.n.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    @Override // defpackage.g27
    public final void h() {
    }

    public final void i(String str, String str2) {
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        try {
            x().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            dq6 dq6Var = this.a;
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.e("Error deleting user property. appId", bi6.n(str), dq6Var.m.f(str2), e);
        }
    }

    public final void j() {
        f();
        x().setTransactionSuccessful();
    }

    public final void k(ow6 ow6Var) {
        e();
        f();
        String strD = ow6Var.D();
        oa3.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        contentValues.put("app_instance_id", ow6Var.E());
        contentValues.put("gmp_app_id", ow6Var.H());
        dq6 dq6Var = ow6Var.a;
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.e();
        contentValues.put("resettable_device_id_hash", ow6Var.e);
        ro6 ro6Var2 = dq6Var.j;
        dq6.h(ro6Var2);
        ro6Var2.e();
        contentValues.put("last_bundle_index", Long.valueOf(ow6Var.g));
        ro6 ro6Var3 = dq6Var.j;
        dq6.h(ro6Var3);
        ro6Var3.e();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(ow6Var.h));
        ro6 ro6Var4 = dq6Var.j;
        dq6.h(ro6Var4);
        ro6Var4.e();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(ow6Var.i));
        contentValues.put("app_version", ow6Var.F());
        ro6 ro6Var5 = dq6Var.j;
        dq6.h(ro6Var5);
        ro6Var5.e();
        contentValues.put("app_store", ow6Var.l);
        ro6 ro6Var6 = dq6Var.j;
        dq6.h(ro6Var6);
        ro6Var6.e();
        contentValues.put("gmp_version", Long.valueOf(ow6Var.m));
        ro6 ro6Var7 = dq6Var.j;
        dq6.h(ro6Var7);
        ro6Var7.e();
        contentValues.put("dev_cert_hash", Long.valueOf(ow6Var.n));
        ro6 ro6Var8 = dq6Var.j;
        dq6.h(ro6Var8);
        ro6Var8.e();
        contentValues.put("measurement_enabled", Boolean.valueOf(ow6Var.o));
        ro6 ro6Var9 = dq6Var.j;
        dq6.h(ro6Var9);
        ro6Var9.e();
        contentValues.put("day", Long.valueOf(ow6Var.v));
        ro6 ro6Var10 = dq6Var.j;
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("daily_public_events_count", Long.valueOf(ow6Var.w));
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("daily_events_count", Long.valueOf(ow6Var.x));
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("daily_conversions_count", Long.valueOf(ow6Var.y));
        ro6 ro6Var11 = dq6Var.j;
        dq6.h(ro6Var11);
        ro6Var11.e();
        contentValues.put("config_fetched_time", Long.valueOf(ow6Var.D));
        ro6 ro6Var12 = dq6Var.j;
        dq6.h(ro6Var12);
        ro6Var12.e();
        contentValues.put("failed_config_fetch_time", Long.valueOf(ow6Var.E));
        contentValues.put("app_version_int", Long.valueOf(ow6Var.z()));
        contentValues.put("firebase_instance_id", ow6Var.G());
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("daily_error_events_count", Long.valueOf(ow6Var.z));
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("daily_realtime_events_count", Long.valueOf(ow6Var.A));
        dq6.h(ro6Var10);
        ro6Var10.e();
        contentValues.put("health_monitor_sample", ow6Var.B);
        ro6 ro6Var13 = dq6Var.j;
        dq6.h(ro6Var13);
        ro6Var13.e();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(ow6Var.y()));
        contentValues.put("admob_app_id", ow6Var.B());
        contentValues.put("dynamite_version", Long.valueOf(ow6Var.A()));
        ro6 ro6Var14 = dq6Var.j;
        dq6.h(ro6Var14);
        ro6Var14.e();
        contentValues.put("session_stitching_token", ow6Var.u);
        ro6 ro6Var15 = dq6Var.j;
        dq6.h(ro6Var15);
        ro6Var15.e();
        ArrayList arrayList = ow6Var.t;
        dq6 dq6Var2 = this.a;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                bi6 bi6Var = dq6Var2.i;
                dq6.h(bi6Var);
                bi6Var.i.c(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((i67) h67.x.w.zza()).zza();
        vv5 vv5Var = dq6Var2.g;
        bi6 bi6Var2 = dq6Var2.i;
        if (vv5Var.n(null, lg6.g0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseX.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                dq6.h(bi6Var2);
                bi6Var2.f.c(bi6.n(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            dq6.h(bi6Var2);
            bi6Var2.f.d(bi6.n(strD), "Error storing app. appId", e);
        }
    }

    public final void l(xz5 xz5Var) {
        dq6 dq6Var = this.a;
        oa3.h(xz5Var);
        e();
        f();
        ContentValues contentValues = new ContentValues();
        String str = xz5Var.a;
        contentValues.put("app_id", str);
        contentValues.put(MediationMetaData.KEY_NAME, xz5Var.b);
        contentValues.put("lifetime_count", Long.valueOf(xz5Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(xz5Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(xz5Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(xz5Var.g));
        contentValues.put("last_bundled_day", xz5Var.h);
        contentValues.put("last_sampled_complex_event_id", xz5Var.i);
        contentValues.put("last_sampling_rate", xz5Var.j);
        contentValues.put("current_session_count", Long.valueOf(xz5Var.e));
        Boolean bool = xz5Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (x().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.f.c(bi6.n(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.d(bi6.n(str), "Error storing event aggregates. appId", e);
        }
    }

    public final boolean m() {
        dq6 dq6Var = this.a;
        Context context = dq6Var.a;
        dq6Var.getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void n(String str, Long l2, long j2, Xn1 xn1) {
        e();
        f();
        oa3.h(xn1);
        oa3.e(str);
        byte[] bArrG = xn1.g();
        dq6 dq6Var = this.a;
        bi6 bi6Var = dq6Var.i;
        bi6 bi6Var2 = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.n.d(dq6Var.m.d(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrG);
        try {
            if (x().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                dq6.h(bi6Var2);
                bi6Var2.f.c(bi6.n(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            dq6.h(bi6Var2);
            bi6Var2.f.d(bi6.n(str), "Error storing complex main event. appId", e);
        }
    }

    public final boolean o(ft5 ft5Var) throws Throwable {
        e();
        f();
        String str = ft5Var.w;
        oa3.h(str);
        h37 h37VarD = D(str, ft5Var.y.x);
        dq6 dq6Var = this.a;
        if (h37VarD == null) {
            long jS = s("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            dq6Var.getClass();
            if (jS >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", ft5Var.x);
        contentValues.put(MediationMetaData.KEY_NAME, ft5Var.y.x);
        Object objB = ft5Var.y.b();
        oa3.h(objB);
        r(contentValues, objB);
        contentValues.put("active", Boolean.valueOf(ft5Var.A));
        contentValues.put("trigger_event_name", ft5Var.B);
        contentValues.put("trigger_timeout", Long.valueOf(ft5Var.D));
        m37 m37Var = dq6Var.l;
        bi6 bi6Var = dq6Var.i;
        dq6.f(m37Var);
        m37Var.getClass();
        contentValues.put("timed_out_event", m37.U(ft5Var.C));
        contentValues.put("creation_timestamp", Long.valueOf(ft5Var.z));
        m37 m37Var2 = dq6Var.l;
        dq6.f(m37Var2);
        m16 m16Var = ft5Var.E;
        m37Var2.getClass();
        contentValues.put("triggered_event", m37.U(m16Var));
        contentValues.put("triggered_timestamp", Long.valueOf(ft5Var.y.y));
        contentValues.put("time_to_live", Long.valueOf(ft5Var.F));
        dq6.f(m37Var2);
        m37Var2.getClass();
        contentValues.put("expired_event", m37.U(ft5Var.G));
        try {
            if (x().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                dq6.h(bi6Var);
                bi6Var.f.c(bi6.n(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e) {
            dq6.h(bi6Var);
            bi6Var.f.d(bi6.n(str), "Error storing conditional user property", e);
        }
        return true;
    }

    public final boolean p(h37 h37Var) throws Throwable {
        e();
        f();
        String str = h37Var.a;
        String str2 = h37Var.c;
        h37 h37VarD = D(str, str2);
        dq6 dq6Var = this.a;
        String str3 = h37Var.b;
        if (h37VarD == null) {
            if (m37.Q(str2)) {
                if (s("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(dq6Var.g.i(str, lg6.H), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jS = s("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                dq6Var.getClass();
                if (jS >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put(MediationMetaData.KEY_NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(h37Var.d));
        r(contentValues, h37Var.e);
        try {
            if (x().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.f.c(bi6.n(str), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.d(bi6.n(str), "Error storing user property. appId", e);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final void q(long j2, long j3, o27 o27Var) throws Throwable {
        ?? r1;
        String string;
        String str;
        String[] strArr;
        dq6 dq6Var = this.a;
        ?? Query = "select metadata_fingerprint from raw_events where app_id = ?";
        e();
        f();
        ?? r5 = 0;
        string = null;
        String string2 = null;
        String str2 = null;
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            try {
                if (TextUtils.isEmpty(null)) {
                    Cursor cursorRawQuery = sQLiteDatabaseX.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j3 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)});
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return;
                    } else {
                        string2 = cursorRawQuery.getString(0);
                        string = cursorRawQuery.getString(1);
                        cursorRawQuery.close();
                    }
                } else {
                    Cursor cursorRawQuery2 = sQLiteDatabaseX.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j3 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null});
                    if (!cursorRawQuery2.moveToFirst()) {
                        cursorRawQuery2.close();
                        return;
                    } else {
                        string = cursorRawQuery2.getString(0);
                        cursorRawQuery2.close();
                    }
                }
                Query = sQLiteDatabaseX.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                if (!Query.moveToFirst()) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.f.c(bi6.n(string2), "Raw event metadata record is missing. appId");
                    Query.close();
                    return;
                }
                try {
                    SjP sjP = (SjP) ((fr6) b37.w(SjP.A1(), Query.getBlob(0))).n();
                    if (Query.moveToNext()) {
                        bi6 bi6Var2 = dq6Var.i;
                        dq6.h(bi6Var2);
                        bi6Var2.i.c(bi6.n(string2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    Query.close();
                    o27Var.a = sjP;
                    if (j3 != -1) {
                        str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{string2, string, String.valueOf(j3)};
                    } else {
                        str = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{string2, string};
                    }
                    Query = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", MediationMetaData.KEY_NAME, "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                    if (!Query.moveToFirst()) {
                        bi6 bi6Var3 = dq6Var.i;
                        dq6.h(bi6Var3);
                        bi6Var3.i.c(bi6.n(string2), "Raw event data disappeared while in transaction. appId");
                        Query.close();
                        return;
                    }
                    do {
                        long j4 = Query.getLong(0);
                        try {
                            km6 km6Var = (km6) b37.w(Xn1.v(), Query.getBlob(3));
                            km6Var.w(Query.getString(1));
                            long j5 = Query.getLong(2);
                            if (km6Var.y) {
                                km6Var.p();
                                km6Var.y = false;
                            }
                            Xn1.G(j5, (Xn1) km6Var.x);
                            if (!o27Var.a(j4, (Xn1) km6Var.n())) {
                                Query.close();
                                return;
                            }
                        } catch (IOException e) {
                            bi6 bi6Var4 = dq6Var.i;
                            dq6.h(bi6Var4);
                            bi6Var4.f.d(bi6.n(string2), "Data loss. Failed to merge raw event. appId", e);
                        }
                    } while (Query.moveToNext());
                    Query.close();
                } catch (IOException e2) {
                    bi6 bi6Var5 = dq6Var.i;
                    dq6.h(bi6Var5);
                    bi6Var5.f.d(bi6.n(string2), "Data loss. Failed to merge raw event metadata. appId", e2);
                    Query.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = string2;
                r1 = Query;
                try {
                    bi6 bi6Var6 = dq6Var.i;
                    dq6.h(bi6Var6);
                    bi6Var6.f.d(bi6.n(str2), "Data loss. Error selecting raw event. appId", e);
                    if (r1 != 0) {
                        r1.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r5 = r1;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = Query;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            r1 = 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final long s(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.f.d(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void t(String str, String str2) {
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        try {
            x().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            dq6 dq6Var = this.a;
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.e("Error deleting conditional property", bi6.n(str), dq6Var.m.f(str2), e);
        }
    }

    public final long u(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e) {
                bi6 bi6Var = this.a.i;
                dq6.h(bi6Var);
                bi6Var.f.d(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long v(String str) {
        dq6 dq6Var = this.a;
        oa3.e(str);
        oa3.e("first_open_count");
        e();
        f();
        SQLiteDatabase sQLiteDatabaseX = x();
        sQLiteDatabaseX.beginTransaction();
        long j2 = 0;
        try {
            try {
                long jU = u("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jU == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseX.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.d(bi6.n(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    jU = 0;
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.e("Error inserting column. appId", bi6.n(str), "first_open_count", e);
                    return j2;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(jU + 1));
                    if (sQLiteDatabaseX.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                        sQLiteDatabaseX.setTransactionSuccessful();
                        return jU;
                    }
                    bi6 bi6Var3 = dq6Var.i;
                    dq6.h(bi6Var3);
                    bi6Var3.f.d(bi6.n(str), "Failed to update column (got 0). appId", "first_open_count");
                    return -1L;
                } catch (SQLiteException e) {
                    e = e;
                    j2 = jU;
                }
            } finally {
                sQLiteDatabaseX.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
    }

    public final long w(String str) {
        oa3.e(str);
        return u("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase x() {
        e();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            bi6 bi6Var = this.a.i;
            dq6.h(bi6Var);
            bi6Var.i.c(e, "Error opening database");
            throw e;
        }
    }

    public final ow6 y(String str) throws Throwable {
        Cursor cursorQuery;
        dq6 dq6Var = this.a;
        oa3.e(str);
        e();
        f();
        Cursor cursor = null;
        try {
            cursorQuery = x().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    ow6 ow6Var = new ow6(this.b.l, str);
                    dq6 dq6Var2 = ow6Var.a;
                    ow6Var.b(cursorQuery.getString(0));
                    ow6Var.p(cursorQuery.getString(1));
                    ow6Var.w(cursorQuery.getString(2));
                    ow6Var.t(cursorQuery.getLong(3));
                    ow6Var.u(cursorQuery.getLong(4));
                    ow6Var.s(cursorQuery.getLong(5));
                    ow6Var.d(cursorQuery.getString(6));
                    ow6Var.c(cursorQuery.getString(7));
                    ow6Var.q(cursorQuery.getLong(8));
                    ow6Var.m(cursorQuery.getLong(9));
                    ow6Var.v(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    ow6Var.l(cursorQuery.getLong(11));
                    ow6Var.j(cursorQuery.getLong(12));
                    ow6Var.i(cursorQuery.getLong(13));
                    ow6Var.g(cursorQuery.getLong(14));
                    ow6Var.f(cursorQuery.getLong(15));
                    long j2 = cursorQuery.getLong(16);
                    ro6 ro6Var = dq6Var2.j;
                    dq6.h(ro6Var);
                    ro6Var.e();
                    ow6Var.C |= ow6Var.E != j2;
                    ow6Var.E = j2;
                    ow6Var.e(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    ow6Var.o(cursorQuery.getString(18));
                    ow6Var.h(cursorQuery.getLong(19));
                    ow6Var.k(cursorQuery.getLong(20));
                    ow6Var.r(cursorQuery.getString(21));
                    boolean z = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    ro6 ro6Var2 = dq6Var2.j;
                    dq6.h(ro6Var2);
                    ro6Var2.e();
                    ow6Var.C |= ow6Var.p != z;
                    ow6Var.p = z;
                    ow6Var.a(cursorQuery.getString(24));
                    ow6Var.n(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        ow6Var.x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    g87.a();
                    if (dq6Var.g.n(null, lg6.p0)) {
                        String string = cursorQuery.getString(28);
                        ro6 ro6Var3 = dq6Var2.j;
                        dq6.h(ro6Var3);
                        ro6Var3.e();
                        ow6Var.C = (true ^ C0239D.M(ow6Var.u, string)) | ow6Var.C;
                        ow6Var.u = string;
                    }
                    ro6 ro6Var4 = dq6Var2.j;
                    dq6.h(ro6Var4);
                    ro6Var4.e();
                    ow6Var.C = false;
                    if (cursorQuery.moveToNext()) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.c(bi6.n(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return ow6Var;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                }
            } catch (SQLiteException e) {
                e = e;
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.d(bi6.n(str), "Error querying app. appId", e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final ft5 z(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        r27 r27Var = this.b;
        dq6 dq6Var = this.a;
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        Cursor cursor = null;
        try {
            cursorQuery = x().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objE = E(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    b37 b37Var = r27Var.g;
                    b37 b37Var2 = r27Var.g;
                    r27.E(b37Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<m16> creator = m16.CREATOR;
                    m16 m16Var = (m16) b37Var.u(blob, creator);
                    long j3 = cursorQuery.getLong(6);
                    r27.E(b37Var2);
                    m16 m16Var2 = (m16) b37Var2.u(cursorQuery.getBlob(7), creator);
                    long j4 = cursorQuery.getLong(8);
                    long j5 = cursorQuery.getLong(9);
                    r27.E(b37Var2);
                    ft5 ft5Var = new ft5(str, str3, new d37(j4, objE, str2, str3), j3, z, string2, m16Var, j2, m16Var2, j5, (m16) b37Var2.u(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        bi6 bi6Var = dq6Var.i;
                        dq6.h(bi6Var);
                        bi6Var.f.d(bi6.n(str), "Got multiple records for conditional property, expected one", dq6Var.m.f(str2));
                    }
                    cursorQuery.close();
                    return ft5Var;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                }
            } catch (SQLiteException e) {
                e = e;
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.e("Error querying conditional property", bi6.n(str), dq6Var.m.f(str2), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }
}
