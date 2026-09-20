package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class gh6 extends kj6 {
    public final bh6 c;
    public boolean d;

    public gh6(dq6 dq6Var) {
        super(dq6Var);
        this.c = new bh6(this, this.a.a);
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return false;
    }

    public final SQLiteDatabase i() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    public final void j() {
        int iDelete;
        dq6 dq6Var = this.a;
        e();
        try {
            SQLiteDatabase sQLiteDatabaseI = i();
            if (sQLiteDatabaseI == null || (iDelete = sQLiteDatabaseI.delete("messages", null, null)) <= 0) {
                return;
            }
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.f.c(e, "Error resetting local analytics data. error");
        }
    }

    public final void k() {
        e();
        if (this.d) {
            return;
        }
        dq6 dq6Var = this.a;
        if (dq6Var.a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase sQLiteDatabaseI = i();
                    if (sQLiteDatabaseI == null) {
                        this.d = true;
                        return;
                    }
                    sQLiteDatabaseI.beginTransaction();
                    sQLiteDatabaseI.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseI.setTransactionSuccessful();
                    sQLiteDatabaseI.endTransaction();
                    sQLiteDatabaseI.close();
                    return;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.f.c(e, "Error deleting app launch break from local database");
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.c(e2, "Error deleting app launch break from local database");
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            bi6Var3.i.b("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.database.Cursor] */
    public final boolean l(int i, byte[] bArr) {
        ?? r9;
        SQLiteDatabase sQLiteDatabaseI;
        ?? r2;
        SQLiteDatabase sQLiteDatabase;
        ?? r10;
        ?? r3;
        ?? r4;
        long j;
        String str;
        e();
        ?? r5 = 0;
        if (this.d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        dq6 dq6Var = this.a;
        dq6Var.getClass();
        int i2 = 5;
        int i3 = 0;
        int i4 = 5;
        while (true) {
            bi6 bi6Var = dq6Var.i;
            if (i3 >= i2) {
                dq6.h(bi6Var);
                bi6Var.n.b("Failed to write entry to local database");
                return false;
            }
            try {
                sQLiteDatabaseI = i();
                if (sQLiteDatabaseI == null) {
                    this.d = true;
                    return r5;
                }
                try {
                    sQLiteDatabaseI.beginTransaction();
                    ?? RawQuery = sQLiteDatabaseI.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r5);
                            } else {
                                j = 0;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r9 = RawQuery;
                            try {
                                SystemClock.sleep(i4);
                                i4 += 20;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseI != null) {
                                    sQLiteDatabaseI.close();
                                }
                                i3++;
                                r5 = 0;
                                i2 = 5;
                            } catch (Throwable th) {
                                th = th;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseI != null) {
                                    sQLiteDatabaseI.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            r10 = RawQuery;
                            try {
                                dq6.h(bi6Var);
                                bi6Var.f.c(e, "Error writing entry; local database full");
                                this.d = true;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (sQLiteDatabaseI != null) {
                                    sQLiteDatabase = sQLiteDatabaseI;
                                    sQLiteDatabase.close();
                                }
                                i3++;
                                r5 = 0;
                                i2 = 5;
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = r10;
                                sQLiteDatabase = sQLiteDatabaseI;
                                sQLiteDatabaseI = sQLiteDatabase;
                                r3 = r4;
                                r9 = r3;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseI != null) {
                                    sQLiteDatabaseI.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseI;
                            r2 = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r4 = r2;
                                    sQLiteDatabaseI = sQLiteDatabase;
                                    r3 = r4;
                                    r9 = r3;
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    if (sQLiteDatabaseI != null) {
                                        sQLiteDatabaseI.close();
                                    }
                                    throw th;
                                }
                            }
                            dq6.h(bi6Var);
                            bi6Var.f.c(e, "Error writing entry to local database");
                            this.d = true;
                            if (r2 != 0) {
                                r2.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i3++;
                            r5 = 0;
                            i2 = 5;
                        } catch (Throwable th4) {
                            th = th4;
                            r9 = RawQuery;
                            if (r9 != 0) {
                                r9.close();
                            }
                            if (sQLiteDatabaseI != null) {
                                sQLiteDatabaseI.close();
                            }
                            throw th;
                        }
                    } else {
                        j = 0;
                    }
                    if (j >= 100000) {
                        dq6.h(bi6Var);
                        bi6Var.f.b("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r5] = Long.toString(j2);
                        long jDelete = sQLiteDatabaseI.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            dq6.h(bi6Var);
                            bi6Var.f.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                        str = null;
                    } else {
                        str = null;
                    }
                    sQLiteDatabaseI.insertOrThrow("messages", str, contentValues);
                    sQLiteDatabaseI.setTransactionSuccessful();
                    sQLiteDatabaseI.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseI.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                    r9 = 0;
                } catch (SQLiteFullException e3) {
                    e = e3;
                    r10 = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    r2 = 0;
                    sQLiteDatabase = sQLiteDatabaseI;
                } catch (Throwable th5) {
                    th = th5;
                    r3 = 0;
                    r9 = r3;
                    if (r9 != 0) {
                        r9.close();
                    }
                    if (sQLiteDatabaseI != null) {
                        sQLiteDatabaseI.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                r9 = 0;
                sQLiteDatabaseI = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                r10 = 0;
                sQLiteDatabaseI = null;
            } catch (SQLiteException e6) {
                e = e6;
                r2 = 0;
                sQLiteDatabase = null;
            } catch (Throwable th6) {
                th = th6;
                r9 = 0;
                sQLiteDatabaseI = null;
            }
            i3++;
            r5 = 0;
            i2 = 5;
        }
    }
}
