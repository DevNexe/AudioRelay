package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzee;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u07 extends kj6 {
    public final s07 c;
    public zzee d;
    public volatile Boolean e;
    public final yz6 f;
    public final zk g;
    public final ArrayList h;
    public final b07 i;

    public u07(dq6 dq6Var) {
        super(dq6Var);
        this.h = new ArrayList();
        this.g = new zk(dq6Var.n);
        this.c = new s07(this);
        this.f = new yz6(this, dq6Var, 0);
        this.i = new b07(this, dq6Var);
    }

    public static void s(u07 u07Var, ComponentName componentName) {
        u07Var.e();
        if (u07Var.d != null) {
            u07Var.d = null;
            bi6 bi6Var = u07Var.a.i;
            dq6.h(bi6Var);
            bi6Var.n.c(componentName, "Disconnected from device MeasurementService");
            u07Var.e();
            u07Var.t();
        }
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x025e A[Catch: all -> 0x02ca, TRY_ENTER, TryCatch #20 {all -> 0x02ca, blocks: (B:30:0x00c9, B:32:0x00cf, B:34:0x00dc, B:36:0x00e2, B:40:0x00f8, B:42:0x00fd, B:140:0x025e, B:142:0x0264, B:143:0x0267, B:160:0x02a2, B:152:0x028b, B:51:0x011b, B:52:0x011e, B:50:0x0116, B:55:0x0124, B:57:0x0138, B:64:0x0150, B:65:0x0154, B:66:0x0157, B:62:0x014a, B:68:0x015a, B:70:0x016e, B:77:0x0186, B:78:0x018a, B:79:0x018d, B:75:0x0180, B:82:0x0191, B:83:0x019e, B:90:0x01bb, B:92:0x01c7, B:94:0x01d7, B:95:0x01e3), top: B:224:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0276  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0292  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b8 A[PHI: r7 r8 r16 r17 r18
  0x02b8: PHI (r7v9 android.database.sqlite.SQLiteDatabase) = 
  (r7v7 android.database.sqlite.SQLiteDatabase)
  (r7v8 android.database.sqlite.SQLiteDatabase)
  (r7v10 android.database.sqlite.SQLiteDatabase)
 binds: [B:147:0x027a, B:164:0x02b6, B:156:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02b8: PHI (r8v19 java.lang.String) = (r8v13 java.lang.String), (r12v1 java.lang.String), (r12v1 java.lang.String) binds: [B:147:0x027a, B:164:0x02b6, B:156:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02b8: PHI (r16v5 int) = (r16v1 int), (r16v3 int), (r16v6 int) binds: [B:147:0x027a, B:164:0x02b6, B:156:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02b8: PHI (r17v7 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v8 java.lang.String) binds: [B:147:0x027a, B:164:0x02b6, B:156:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x02b8: PHI (r18v13 int) = (r18v9 int), (r18v11 int), (r18v14 int) binds: [B:147:0x027a, B:164:0x02b6, B:156:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x02bc A[PHI: r8 r13 r17 r18
  0x02bc: PHI (r8v15 java.lang.String) = (r8v13 java.lang.String), (r12v1 java.lang.String) binds: [B:149:0x027d, B:163:0x02b4] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r13v12 int) = (r13v11 int), (r16v1 int) binds: [B:149:0x027d, B:163:0x02b4] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String) binds: [B:149:0x027d, B:163:0x02b4] A[DONT_GENERATE, DONT_INLINE]
  0x02bc: PHI (r18v10 int) = (r18v9 int), (r18v11 int) binds: [B:149:0x027d, B:163:0x02b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:252:0x02be A[SYNTHETIC] */
    public final void i(zzee zzeeVar, com5Fixed com5Var, p97 p97Var) throws Throwable {
        ArrayList arrayList;
        int size;
        SQLiteDatabase sQLiteDatabaseI;
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        ft5 ft5VarCreateFromParcel;
        d37 d37VarCreateFromParcel;
        e();
        f();
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        dq6Var.getClass();
        int i = 100;
        int i2 = 100;
        int i3 = 0;
        while (i3 < 1001 && i2 == i) {
            ArrayList arrayList2 = new ArrayList();
            gh6 gh6VarN = dq6Var.n();
            String str2 = "rowid";
            String str3 = "Error reading entries from local database";
            gh6VarN.e();
            if (gh6VarN.d) {
                i3 = i3;
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                dq6 dq6Var2 = gh6VarN.a;
                if (dq6Var2.a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i4 = 5;
                    int i5 = 0;
                    int i6 = 5;
                    while (true) {
                        if (i5 < i4) {
                            try {
                                sQLiteDatabaseI = gh6VarN.i();
                                if (sQLiteDatabaseI == null) {
                                    try {
                                        try {
                                            gh6VarN.d = true;
                                            i3 = i3;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i3 = i3;
                                            str2 = str2;
                                            cursorQuery = null;
                                            SystemClock.sleep(i6);
                                            i6 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseI != null) {
                                                sQLiteDatabaseI.close();
                                            }
                                            i5++;
                                            str3 = str3;
                                            str2 = str2;
                                            i3 = i3;
                                            i4 = 5;
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            i3 = i3;
                                            str2 = str2;
                                            cursorQuery = null;
                                            bi6 bi6Var = dq6Var2.i;
                                            dq6.h(bi6Var);
                                            bi6Var.f.c(e, str3);
                                            gh6VarN.d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseI != null) {
                                                i6 = i6;
                                                sQLiteDatabaseI.close();
                                            } else {
                                                i6 = i6;
                                            }
                                            i5++;
                                            str3 = str3;
                                            str2 = str2;
                                            i3 = i3;
                                            i4 = 5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i3 = i3;
                                            str2 = str2;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseI != null) {
                                                sQLiteDatabaseI.endTransaction();
                                            }
                                            bi6 bi6Var2 = dq6Var2.i;
                                            dq6.h(bi6Var2);
                                            bi6Var2.f.c(e, str3);
                                            gh6VarN.d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            str3 = str3;
                                            if (sQLiteDatabaseI != null) {
                                                sQLiteDatabaseI.close();
                                            } else {
                                                i6 = i6;
                                                i6 = i6;
                                            }
                                            i5++;
                                            str3 = str3;
                                            str2 = str2;
                                            i3 = i3;
                                            i4 = 5;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } else {
                                    sQLiteDatabaseI.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseI.query("messages", new String[]{str2}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j2 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                j = cursorQuery2.getLong(0);
                                                cursorQuery2.close();
                                            } else {
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            cursorQuery = sQLiteDatabaseI.query("messages", new String[]{str2, "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                            while (cursorQuery.moveToNext()) {
                                                try {
                                                    try {
                                                        j2 = cursorQuery.getLong(0);
                                                        int i7 = cursorQuery.getInt(1);
                                                        str2 = str2;
                                                        try {
                                                            byte[] blob = cursorQuery.getBlob(2);
                                                            if (i7 == 0) {
                                                                Parcel parcelObtain = Parcel.obtain();
                                                                try {
                                                                    i3 = i3;
                                                                    try {
                                                                        try {
                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain.setDataPosition(0);
                                                                            m16 m16VarCreateFromParcel = m16.CREATOR.createFromParcel(parcelObtain);
                                                                            try {
                                                                                parcelObtain.recycle();
                                                                                if (m16VarCreateFromParcel != null) {
                                                                                    arrayList3.add(m16VarCreateFromParcel);
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused2) {
                                                                                SystemClock.sleep(i6);
                                                                                i6 += 20;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                if (sQLiteDatabaseI != null) {
                                                                                    sQLiteDatabaseI.close();
                                                                                }
                                                                                i5++;
                                                                                str3 = str3;
                                                                                str2 = str2;
                                                                                i3 = i3;
                                                                                i4 = 5;
                                                                            } catch (SQLiteFullException e3) {
                                                                                e = e3;
                                                                                bi6 bi6Var3 = dq6Var2.i;
                                                                                dq6.h(bi6Var3);
                                                                                bi6Var3.f.c(e, str3);
                                                                                gh6VarN.d = true;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                if (sQLiteDatabaseI != null) {
                                                                                    i6 = i6;
                                                                                    sQLiteDatabaseI.close();
                                                                                } else {
                                                                                    i6 = i6;
                                                                                }
                                                                                i5++;
                                                                                str3 = str3;
                                                                                str2 = str2;
                                                                                i3 = i3;
                                                                                i4 = 5;
                                                                            } catch (SQLiteException e4) {
                                                                                e = e4;
                                                                                if (sQLiteDatabaseI != null) {
                                                                                    sQLiteDatabaseI.endTransaction();
                                                                                }
                                                                                bi6 bi6Var4 = dq6Var2.i;
                                                                                dq6.h(bi6Var4);
                                                                                bi6Var4.f.c(e, str3);
                                                                                gh6VarN.d = true;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                                str3 = str3;
                                                                                if (sQLiteDatabaseI != null) {
                                                                                    sQLiteDatabaseI.close();
                                                                                } else {
                                                                                    i6 = i6;
                                                                                    i6 = i6;
                                                                                }
                                                                                i5++;
                                                                                str3 = str3;
                                                                                str2 = str2;
                                                                                i3 = i3;
                                                                                i4 = 5;
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            parcelObtain.recycle();
                                                                            throw th;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                                        bi6 bi6Var5 = dq6Var2.i;
                                                                        dq6.h(bi6Var5);
                                                                        bi6Var5.f.b("Failed to load event from local database");
                                                                        parcelObtain.recycle();
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused4) {
                                                                    i3 = i3;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            } else {
                                                                i3 = i3;
                                                                if (i7 == 1) {
                                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain2.setDataPosition(0);
                                                                            d37VarCreateFromParcel = d37.CREATOR.createFromParcel(parcelObtain2);
                                                                            parcelObtain2.recycle();
                                                                        } catch (SafeParcelReader.ParseException unused5) {
                                                                            bi6 bi6Var6 = dq6Var2.i;
                                                                            dq6.h(bi6Var6);
                                                                            bi6Var6.f.b("Failed to load user property from local database");
                                                                            parcelObtain2.recycle();
                                                                            d37VarCreateFromParcel = null;
                                                                        }
                                                                        if (d37VarCreateFromParcel != null) {
                                                                            arrayList3.add(d37VarCreateFromParcel);
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        parcelObtain2.recycle();
                                                                        throw th4;
                                                                    }
                                                                } else if (i7 == 2) {
                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                    try {
                                                                        try {
                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                            parcelObtain3.setDataPosition(0);
                                                                            ft5VarCreateFromParcel = ft5.CREATOR.createFromParcel(parcelObtain3);
                                                                            parcelObtain3.recycle();
                                                                        } catch (SafeParcelReader.ParseException unused6) {
                                                                            bi6 bi6Var7 = dq6Var2.i;
                                                                            dq6.h(bi6Var7);
                                                                            bi6Var7.f.b("Failed to load conditional user property from local database");
                                                                            parcelObtain3.recycle();
                                                                            ft5VarCreateFromParcel = null;
                                                                        }
                                                                        if (ft5VarCreateFromParcel != null) {
                                                                            arrayList3.add(ft5VarCreateFromParcel);
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        parcelObtain3.recycle();
                                                                        throw th5;
                                                                    }
                                                                } else if (i7 == 3) {
                                                                    bi6 bi6Var8 = dq6Var2.i;
                                                                    dq6.h(bi6Var8);
                                                                    bi6Var8.i.b("Skipping app launch break");
                                                                } else {
                                                                    bi6 bi6Var9 = dq6Var2.i;
                                                                    dq6.h(bi6Var9);
                                                                    bi6Var9.f.b("Unknown record type in local database");
                                                                }
                                                            }
                                                            str2 = str2;
                                                            i3 = i3;
                                                        } catch (SQLiteDatabaseLockedException unused7) {
                                                            i3 = i3;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            i3 = i3;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            i3 = i3;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused8) {
                                                        i3 = i3;
                                                        str2 = str2;
                                                    } catch (SQLiteFullException e7) {
                                                        e = e7;
                                                        i3 = i3;
                                                        str2 = str2;
                                                    } catch (SQLiteException e8) {
                                                        e = e8;
                                                        i3 = i3;
                                                        str2 = str2;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor = cursorQuery;
                                                }
                                            }
                                            i3 = i3;
                                            str2 = str2;
                                            String[] strArr2 = new String[1];
                                            try {
                                                strArr2[0] = Long.toString(j2);
                                                if (sQLiteDatabaseI.delete("messages", "rowid <= ?", strArr2) < arrayList3.size()) {
                                                    bi6 bi6Var10 = dq6Var2.i;
                                                    dq6.h(bi6Var10);
                                                    bi6Var10.f.b("Fewer entries removed from local database than expected");
                                                }
                                                sQLiteDatabaseI.setTransactionSuccessful();
                                                sQLiteDatabaseI.endTransaction();
                                                cursorQuery.close();
                                                sQLiteDatabaseI.close();
                                            } catch (SQLiteDatabaseLockedException unused9) {
                                                SystemClock.sleep(i6);
                                                i6 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseI != null) {
                                                    sQLiteDatabaseI.close();
                                                }
                                                i5++;
                                                str3 = str3;
                                                str2 = str2;
                                                i3 = i3;
                                                i4 = 5;
                                            } catch (SQLiteFullException e9) {
                                                e = e9;
                                                bi6 bi6Var11 = dq6Var2.i;
                                                dq6.h(bi6Var11);
                                                bi6Var11.f.c(e, str3);
                                                gh6VarN.d = true;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseI != null) {
                                                    i6 = i6;
                                                    sQLiteDatabaseI.close();
                                                } else {
                                                    i6 = i6;
                                                }
                                                i5++;
                                                str3 = str3;
                                                str2 = str2;
                                                i3 = i3;
                                                i4 = 5;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                if (sQLiteDatabaseI != null) {
                                                    sQLiteDatabaseI.endTransaction();
                                                }
                                                bi6 bi6Var12 = dq6Var2.i;
                                                dq6.h(bi6Var12);
                                                bi6Var12.f.c(e, str3);
                                                gh6VarN.d = true;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                str3 = str3;
                                                if (sQLiteDatabaseI != null) {
                                                    sQLiteDatabaseI.close();
                                                } else {
                                                    i6 = i6;
                                                    i6 = i6;
                                                }
                                                i5++;
                                                str3 = str3;
                                                str2 = str2;
                                                i3 = i3;
                                                i4 = 5;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            if (cursorQuery2 != null) {
                                                try {
                                                    cursorQuery2.close();
                                                } catch (SQLiteDatabaseLockedException unused10) {
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i6);
                                                    i6 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseI != null) {
                                                        sQLiteDatabaseI.close();
                                                    }
                                                    i5++;
                                                    str3 = str3;
                                                    str2 = str2;
                                                    i3 = i3;
                                                    i4 = 5;
                                                } catch (SQLiteFullException e11) {
                                                    e = e11;
                                                    cursorQuery = null;
                                                    bi6 bi6Var13 = dq6Var2.i;
                                                    dq6.h(bi6Var13);
                                                    bi6Var13.f.c(e, str3);
                                                    gh6VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseI != null) {
                                                        i6 = i6;
                                                        sQLiteDatabaseI.close();
                                                    } else {
                                                        i6 = i6;
                                                    }
                                                    i5++;
                                                    str3 = str3;
                                                    str2 = str2;
                                                    i3 = i3;
                                                    i4 = 5;
                                                } catch (SQLiteException e12) {
                                                    e = e12;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseI != null && sQLiteDatabaseI.inTransaction()) {
                                                        sQLiteDatabaseI.endTransaction();
                                                    }
                                                    bi6 bi6Var14 = dq6Var2.i;
                                                    dq6.h(bi6Var14);
                                                    bi6Var14.f.c(e, str3);
                                                    gh6VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    str3 = str3;
                                                    if (sQLiteDatabaseI != null) {
                                                        sQLiteDatabaseI.close();
                                                    } else {
                                                        i6 = i6;
                                                        i6 = i6;
                                                    }
                                                    i5++;
                                                    str3 = str3;
                                                    str2 = str2;
                                                    i3 = i3;
                                                    i4 = 5;
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursorQuery2 = null;
                                    }
                                }
                                th = th;
                            } catch (SQLiteDatabaseLockedException unused11) {
                                i3 = i3;
                                str2 = str2;
                                cursorQuery = null;
                                sQLiteDatabaseI = null;
                            } catch (SQLiteFullException e13) {
                                e = e13;
                                i3 = i3;
                                str2 = str2;
                                cursorQuery = null;
                                sQLiteDatabaseI = null;
                            } catch (SQLiteException e14) {
                                e = e14;
                                i3 = i3;
                                str2 = str2;
                                cursorQuery = null;
                                sQLiteDatabaseI = null;
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteDatabaseI = null;
                            }
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseI != null) {
                                sQLiteDatabaseI.close();
                            }
                            throw th;
                        }
                        i3 = i3;
                        bi6 bi6Var15 = dq6Var2.i;
                        dq6.h(bi6Var15);
                        bi6Var15.i.b("Failed to read events from database in reasonable time");
                        arrayList = null;
                        i5++;
                        str3 = str3;
                        str2 = str2;
                        i3 = i3;
                        i4 = 5;
                    }
                } else {
                    i3 = i3;
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            i = 100;
            if (com5Var != null && size < 100) {
                arrayList2.add(com5Var);
            }
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                com5Fixed com5Var2 = (com5Fixed) arrayList2.get(i8);
                boolean z = com5Var2 instanceof m16;
                bi6 bi6Var16 = dq6Var.i;
                if (z) {
                    try {
                        zzeeVar.I0((m16) com5Var2, p97Var);
                    } catch (RemoteException e15) {
                        dq6.h(bi6Var16);
                        bi6Var16.f.c(e15, "Failed to send event to the service");
                    }
                } else if (com5Var2 instanceof d37) {
                    try {
                        zzeeVar.L((d37) com5Var2, p97Var);
                    } catch (RemoteException e16) {
                        dq6.h(bi6Var16);
                        bi6Var16.f.c(e16, "Failed to send user property to the service");
                    }
                } else if (com5Var2 instanceof ft5) {
                    try {
                        zzeeVar.O((ft5) com5Var2, p97Var);
                    } catch (RemoteException e17) {
                        dq6.h(bi6Var16);
                        bi6Var16.f.c(e17, "Failed to send conditional user property to the service");
                    }
                } else {
                    dq6.h(bi6Var16);
                    bi6Var16.f.b("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i2 = size;
        }
    }

    public final void j(ft5 ft5Var) {
        boolean zL;
        e();
        f();
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        gh6 gh6VarN = dq6Var.n();
        dq6 dq6Var2 = gh6VarN.a;
        m37 m37Var = dq6Var2.l;
        dq6.f(m37Var);
        m37Var.getClass();
        byte[] bArrU = m37.U(ft5Var);
        if (bArrU.length > 131072) {
            bi6 bi6Var = dq6Var2.i;
            dq6.h(bi6Var);
            bi6Var.g.b("Conditional user property too long for local database. Sending directly to service");
            zL = false;
        } else {
            zL = gh6VarN.l(2, bArrU);
        }
        q(new f07(this, n(true), zL, new ft5(ft5Var)));
    }

    public final boolean k() {
        e();
        f();
        return this.d != null;
    }

    public final boolean l() {
        e();
        f();
        if (!m()) {
            return true;
        }
        m37 m37Var = this.a.l;
        dq6.f(m37Var);
        return m37Var.e0() >= ((Integer) lg6.f0.a(null)).intValue();
    }

    public final boolean m() {
        e();
        f();
        if (this.e == null) {
            e();
            f();
            xj6 xj6Var = this.a.h;
            dq6.f(xj6Var);
            xj6Var.e();
            boolean z = false;
            Boolean boolValueOf = !xj6Var.i().contains("use_service") ? null : Boolean.valueOf(xj6Var.i().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.a.getClass();
                wg6 wg6VarM = this.a.m();
                wg6VarM.f();
                if (wg6VarM.k == 1) {
                    z = true;
                } else {
                    bi6 bi6Var = this.a.i;
                    dq6.h(bi6Var);
                    bi6Var.n.b("Checking service availability");
                    m37 m37Var = this.a.l;
                    dq6.f(m37Var);
                    m37Var.getClass();
                    int iC = oa1.b.c(m37Var.a.a, 12451000);
                    if (iC == 0) {
                        bi6 bi6Var2 = this.a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.n.b("Service available");
                    } else if (iC != 1) {
                        if (iC == 2) {
                            bi6 bi6Var3 = this.a.i;
                            dq6.h(bi6Var3);
                            bi6Var3.m.b("Service container out of date");
                            m37 m37Var2 = this.a.l;
                            dq6.f(m37Var2);
                            if (m37Var2.e0() >= 17443) {
                                if (boolValueOf != null) {
                                }
                                z = z2;
                                z2 = false;
                            }
                        } else if (iC == 3) {
                            bi6 bi6Var4 = this.a.i;
                            dq6.h(bi6Var4);
                            bi6Var4.i.b("Service disabled");
                        } else if (iC == 9) {
                            bi6 bi6Var5 = this.a.i;
                            dq6.h(bi6Var5);
                            bi6Var5.i.b("Service invalid");
                        } else if (iC != 18) {
                            bi6 bi6Var6 = this.a.i;
                            dq6.h(bi6Var6);
                            bi6Var6.i.c(Integer.valueOf(iC), "Unexpected service status");
                        } else {
                            bi6 bi6Var7 = this.a.i;
                            dq6.h(bi6Var7);
                            bi6Var7.i.b("Service updating");
                        }
                        z2 = false;
                        z = z2;
                        z2 = false;
                    } else {
                        bi6 bi6Var8 = this.a.i;
                        dq6.h(bi6Var8);
                        bi6Var8.n.b("Service missing");
                    }
                    z = true;
                }
                if (!z && this.a.g.r()) {
                    bi6 bi6Var9 = this.a.i;
                    dq6.h(bi6Var9);
                    bi6Var9.f.b("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    xj6 xj6Var2 = this.a.h;
                    dq6.f(xj6Var2);
                    xj6Var2.e();
                    SharedPreferences.Editor editorEdit = xj6Var2.i().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0297  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:77:0x0209  */
    /* JADX WARN: Code duplicated, block: B:80:0x021a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x0243  */
    /* JADX WARN: Code duplicated, block: B:88:0x0245  */
    /* JADX WARN: Code duplicated, block: B:91:0x0264  */
    /* JADX WARN: Code duplicated, block: B:93:0x026d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0277  */
    /* JADX WARN: Code duplicated, block: B:97:0x0289  */
    /* JADX WARN: Code duplicated, block: B:99:0x0294  */
    public final p97 n(boolean z) {
        long jF0;
        long j;
        long j2;
        String str;
        String str2;
        long jA;
        long j3;
        long jMin;
        Boolean boolM;
        boolean z2;
        String str3;
        Boolean boolM2;
        Boolean boolValueOf;
        String str4;
        String str5;
        long jAbs;
        Pair pair;
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        wg6 wg6VarM = dq6Var.m();
        String strA = null;
        if (z) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            dq6 dq6Var2 = bi6Var.a;
            xj6 xj6Var = dq6Var2.h;
            dq6.f(xj6Var);
            if (xj6Var.d != null) {
                xj6 xj6Var2 = dq6Var2.h;
                dq6.f(xj6Var2);
                rj6 rj6Var = xj6Var2.d;
                xj6 xj6Var3 = rj6Var.e;
                xj6Var3.e();
                xj6Var3.e();
                long j4 = rj6Var.e.i().getLong(rj6Var.a, 0L);
                if (j4 == 0) {
                    rj6Var.a();
                    jAbs = 0;
                } else {
                    xj6Var3.a.n.getClass();
                    jAbs = Math.abs(j4 - System.currentTimeMillis());
                }
                long j5 = rj6Var.d;
                if (jAbs < j5) {
                    pair = null;
                } else if (jAbs > j5 + j5) {
                    rj6Var.a();
                    pair = null;
                } else {
                    String string = xj6Var3.i().getString(rj6Var.c, null);
                    long j6 = xj6Var3.i().getLong(rj6Var.b, 0L);
                    rj6Var.a();
                    pair = (string == null || j6 <= 0) ? xj6.w : new Pair(string, Long.valueOf(j6));
                }
                if (pair != null && pair != xj6.w) {
                    strA = LPt6Fixed.a(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        }
        String str6 = strA;
        wg6VarM.e();
        String strJ = wg6VarM.j();
        String strK = wg6VarM.k();
        wg6VarM.f();
        String str7 = wg6VarM.d;
        wg6VarM.f();
        long j7 = wg6VarM.e;
        wg6VarM.f();
        oa3.h(wg6VarM.f);
        String str8 = wg6VarM.f;
        dq6 dq6Var3 = wg6VarM.a;
        dq6Var3.g.j();
        wg6VarM.f();
        wg6VarM.e();
        long j8 = wg6VarM.g;
        m37 m37Var = dq6Var3.l;
        Context context = dq6Var3.a;
        if (j8 == 0) {
            dq6.f(m37Var);
            String packageName = context.getPackageName();
            m37Var.e();
            oa3.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestM = m37.m();
            dq6 dq6Var4 = m37Var.a;
            if (messageDigestM == null) {
                bi6 bi6Var2 = dq6Var4.i;
                dq6.h(bi6Var2);
                bi6Var2.f.b("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (m37Var.O(context, packageName)) {
                            jF0 = 0;
                        } else {
                            Signature[] signatureArr = so5.a(context).b(64, dq6Var4.a.getPackageName()).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                bi6 bi6Var3 = dq6Var4.i;
                                dq6.h(bi6Var3);
                                bi6Var3.i.b("Could not get signatures");
                            } else {
                                jF0 = m37.f0(messageDigestM.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        bi6 bi6Var4 = dq6Var4.i;
                        dq6.h(bi6Var4);
                        bi6Var4.f.c(e, "Package name not found");
                    }
                } else {
                    jF0 = 0;
                }
                wg6VarM.g = jF0;
            }
            jF0 = -1;
            wg6VarM.g = jF0;
        } else {
            jF0 = j8;
        }
        boolean zD = dq6Var3.d();
        xj6 xj6Var4 = dq6Var3.h;
        dq6.f(xj6Var4);
        boolean z3 = !xj6Var4.o;
        wg6VarM.e();
        boolean zD2 = dq6Var3.d();
        vv5 vv5Var = dq6Var3.g;
        if (zD2) {
            ((y87) x87.x.w.zza()).zza();
            j = jF0;
            boolean zN = vv5Var.n(null, lg6.b0);
            bi6 bi6Var5 = dq6Var3.i;
            if (!zN) {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Class<?>[] clsArr = new Class[1];
                            str = str8;
                            try {
                                clsArr[0] = Context.class;
                                Method declaredMethod = clsLoadClass.getDeclaredMethod("getInstance", clsArr);
                                Object[] objArr = new Object[1];
                                j2 = j7;
                                try {
                                    objArr[0] = context;
                                    Object objInvoke = declaredMethod.invoke(null, objArr);
                                    if (objInvoke != null) {
                                        try {
                                            str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                        } catch (Exception unused) {
                                            dq6.h(bi6Var5);
                                            bi6Var5.k.b("Failed to retrieve Firebase Instance Id");
                                            str2 = null;
                                        }
                                    }
                                } catch (Exception unused2) {
                                    dq6.h(bi6Var5);
                                    bi6Var5.j.b("Failed to obtain Firebase Analytics instance");
                                }
                            } catch (Exception unused3) {
                                j2 = j7;
                            }
                        } catch (Exception unused4) {
                            j2 = j7;
                            str = str8;
                        }
                        jA = xj6Var4.e.a();
                        j3 = dq6Var3.G;
                        if (jA == 0) {
                            jMin = j3;
                        } else {
                            jMin = Math.min(j3, jA);
                        }
                        wg6VarM.f();
                        int i = wg6VarM.k;
                        boolM = vv5Var.m("google_analytics_adid_collection_enabled");
                        if (boolM != null || boolM.booleanValue()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        xj6Var4.e();
                        boolean z4 = xj6Var4.i().getBoolean("deferred_analytics_collection", false);
                        wg6VarM.f();
                        str3 = wg6VarM.m;
                        boolM2 = vv5Var.m("google_analytics_default_allow_ad_personalization_signals");
                        if (boolM2 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(!boolM2.booleanValue());
                        }
                        Boolean bool = boolValueOf;
                        long j9 = wg6VarM.h;
                        List list = wg6VarM.i;
                        String strE = xj6Var4.k().e();
                        if (wg6VarM.j == null) {
                            if (vv5Var.n(null, lg6.v0)) {
                                dq6.f(m37Var);
                                wg6VarM.j = m37Var.k();
                            } else {
                                wg6VarM.j = "";
                            }
                        }
                        String str9 = wg6VarM.j;
                        g87.a();
                        if (vv5Var.n(null, lg6.q0)) {
                            wg6VarM.e();
                            if (wg6VarM.o == 0) {
                                str4 = str3;
                            } else {
                                dq6Var3.n.getClass();
                                str4 = str3;
                                long jCurrentTimeMillis = System.currentTimeMillis() - wg6VarM.o;
                                if (wg6VarM.n != null && jCurrentTimeMillis > 86400000 && wg6VarM.p == null) {
                                    wg6VarM.l();
                                }
                            }
                            if (wg6VarM.n == null) {
                                wg6VarM.l();
                            }
                            str5 = wg6VarM.n;
                        } else {
                            str4 = str3;
                            str5 = null;
                        }
                        return new p97(strJ, strK, str7, j2, str, 73000L, j, str6, zD, z3, str2, jMin, i, z2, z4, str4, bool, j9, list, strE, str9, str5);
                    }
                } catch (ClassNotFoundException unused5) {
                }
                str2 = null;
                jA = xj6Var4.e.a();
                j3 = dq6Var3.G;
                if (jA == 0) {
                    jMin = j3;
                } else {
                    jMin = Math.min(j3, jA);
                }
                wg6VarM.f();
                int i2 = wg6VarM.k;
                boolM = vv5Var.m("google_analytics_adid_collection_enabled");
                if (boolM != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                xj6Var4.e();
                boolean z5 = xj6Var4.i().getBoolean("deferred_analytics_collection", false);
                wg6VarM.f();
                str3 = wg6VarM.m;
                boolM2 = vv5Var.m("google_analytics_default_allow_ad_personalization_signals");
                if (boolM2 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(!boolM2.booleanValue());
                }
                Boolean bool2 = boolValueOf;
                long j10 = wg6VarM.h;
                List list2 = wg6VarM.i;
                String strE2 = xj6Var4.k().e();
                if (wg6VarM.j == null) {
                    if (vv5Var.n(null, lg6.v0)) {
                        dq6.f(m37Var);
                        wg6VarM.j = m37Var.k();
                    } else {
                        wg6VarM.j = "";
                    }
                }
                String str10 = wg6VarM.j;
                g87.a();
                if (vv5Var.n(null, lg6.q0)) {
                    wg6VarM.e();
                    if (wg6VarM.o == 0) {
                        str4 = str3;
                    } else {
                        dq6Var3.n.getClass();
                        str4 = str3;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - wg6VarM.o;
                        if (wg6VarM.n != null) {
                            wg6VarM.l();
                        }
                    }
                    if (wg6VarM.n == null) {
                        wg6VarM.l();
                    }
                    str5 = wg6VarM.n;
                } else {
                    str4 = str3;
                    str5 = null;
                }
                return new p97(strJ, strK, str7, j2, str, 73000L, j, str6, zD, z3, str2, jMin, i2, z2, z5, str4, bool2, j10, list2, strE2, str10, str5);
            }
            dq6.h(bi6Var5);
            bi6Var5.n.b("Disabled IID for tests.");
        } else {
            j = jF0;
        }
        j2 = j7;
        str = str8;
        str2 = null;
        jA = xj6Var4.e.a();
        j3 = dq6Var3.G;
        if (jA == 0) {
            jMin = j3;
        } else {
            jMin = Math.min(j3, jA);
        }
        wg6VarM.f();
        int i3 = wg6VarM.k;
        boolM = vv5Var.m("google_analytics_adid_collection_enabled");
        if (boolM != null) {
            z2 = true;
        } else {
            z2 = true;
        }
        xj6Var4.e();
        boolean z6 = xj6Var4.i().getBoolean("deferred_analytics_collection", false);
        wg6VarM.f();
        str3 = wg6VarM.m;
        boolM2 = vv5Var.m("google_analytics_default_allow_ad_personalization_signals");
        if (boolM2 == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(!boolM2.booleanValue());
        }
        Boolean bool3 = boolValueOf;
        long j11 = wg6VarM.h;
        List list3 = wg6VarM.i;
        String strE3 = xj6Var4.k().e();
        if (wg6VarM.j == null) {
            if (vv5Var.n(null, lg6.v0)) {
                dq6.f(m37Var);
                wg6VarM.j = m37Var.k();
            } else {
                wg6VarM.j = "";
            }
        }
        String str11 = wg6VarM.j;
        g87.a();
        if (vv5Var.n(null, lg6.q0)) {
            wg6VarM.e();
            if (wg6VarM.o == 0) {
                str4 = str3;
            } else {
                dq6Var3.n.getClass();
                str4 = str3;
                long jCurrentTimeMillis3 = System.currentTimeMillis() - wg6VarM.o;
                if (wg6VarM.n != null) {
                    wg6VarM.l();
                }
            }
            if (wg6VarM.n == null) {
                wg6VarM.l();
            }
            str5 = wg6VarM.n;
        } else {
            str4 = str3;
            str5 = null;
        }
        return new p97(strJ, strK, str7, j2, str, 73000L, j, str6, zD, z3, str2, jMin, i3, z2, z6, str4, bool3, j11, list3, strE3, str11, str5);
    }

    public final void o() {
        e();
        dq6 dq6Var = this.a;
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        ArrayList arrayList = this.h;
        bi6Var.n.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                bi6 bi6Var2 = dq6Var.i;
                dq6.h(bi6Var2);
                bi6Var2.f.c(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.i.a();
    }

    public final void p() {
        e();
        zk zkVar = this.g;
        zkVar.a = ((ft) zkVar.b).c();
        this.a.getClass();
        this.f.c(((Long) lg6.K.a(null)).longValue());
    }

    public final void q(Runnable runnable) {
        e();
        if (k()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        if (size >= 1000) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.f.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.i.c(60000L);
            t();
        }
    }

    public final Boolean r() {
        return this.e;
    }

    public final void t() {
        e();
        f();
        if (k()) {
            return;
        }
        if (m()) {
            s07 s07Var = this.c;
            s07Var.c.e();
            Context context = s07Var.c.a.a;
            synchronized (s07Var) {
                if (s07Var.a) {
                    bi6 bi6Var = s07Var.c.a.i;
                    dq6.h(bi6Var);
                    bi6Var.n.b("Connection attempt already in progress");
                    return;
                } else {
                    if (s07Var.b != null && (s07Var.b.isConnecting() || s07Var.b.isConnected())) {
                        bi6 bi6Var2 = s07Var.c.a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.n.b("Already awaiting connection attempt");
                        return;
                    }
                    s07Var.b = new nh6(context, Looper.getMainLooper(), s07Var, s07Var);
                    bi6 bi6Var3 = s07Var.c.a.i;
                    dq6.h(bi6Var3);
                    bi6Var3.n.b("Connecting to remote service");
                    s07Var.a = true;
                    oa3.h(s07Var.b);
                    s07Var.b.checkAvailabilityAndConnect();
                    return;
                }
            }
        }
        if (this.a.g.r()) {
            return;
        }
        this.a.getClass();
        List<ResolveInfo> listQueryIntentServices = this.a.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            bi6 bi6Var4 = this.a.i;
            dq6.h(bi6Var4);
            bi6Var4.f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"));
        s07 s07Var2 = this.c;
        s07Var2.c.e();
        Context context2 = s07Var2.c.a.a;
        e60 e60VarB = e60.b();
        synchronized (s07Var2) {
            if (s07Var2.a) {
                bi6 bi6Var5 = s07Var2.c.a.i;
                dq6.h(bi6Var5);
                bi6Var5.n.b("Connection attempt already in progress");
            } else {
                bi6 bi6Var6 = s07Var2.c.a.i;
                dq6.h(bi6Var6);
                bi6Var6.n.b("Using local app measurement service");
                s07Var2.a = true;
                e60VarB.a(context2, intent, s07Var2.c.c, 129);
            }
        }
    }

    public final void u() {
        e();
        f();
        s07 s07Var = this.c;
        if (s07Var.b != null && (s07Var.b.isConnected() || s07Var.b.isConnecting())) {
            s07Var.b.disconnect();
        }
        s07Var.b = null;
        try {
            e60.b().c(this.a.a, this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void v(AtomicReference atomicReference) {
        e();
        f();
        q(new vr5(this, atomicReference, n(false), 2));
    }
}
