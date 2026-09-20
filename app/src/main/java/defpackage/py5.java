package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class py5 {
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: SQLiteException -> 0x00d8, TryCatch #0 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:48:0x00d4, B:49:0x00d7, B:27:0x0069), top: B:57:0x004f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: SQLiteException -> 0x00d8, LOOP:0: B:29:0x007d->B:32:0x0087, LOOP_END, TryCatch #0 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:48:0x00d4, B:49:0x00d7, B:27:0x0069), top: B:57:0x004f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[Catch: SQLiteException -> 0x00d8, TryCatch #0 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:48:0x00d4, B:49:0x00d7, B:27:0x0069), top: B:57:0x004f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7 A[Catch: SQLiteException -> 0x00d8, TryCatch #0 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:48:0x00d4, B:49:0x00d7, B:27:0x0069), top: B:57:0x004f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[Catch: SQLiteException -> 0x00d8, TryCatch #0 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:48:0x00d4, B:49:0x00d7, B:27:0x0069), top: B:57:0x004f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static void a(bi6 bi6Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        String[] strArr2;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        wh6 wh6Var = bi6Var.i;
        Cursor cursorQuery = null;
        try {
            try {
                strArr2 = null;
                try {
                    cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{MediationMetaData.KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                    try {
                        boolean zMoveToFirst = cursorQuery.moveToFirst();
                        cursorQuery.close();
                        if (!zMoveToFirst) {
                            sQLiteDatabase.execSQL(str2);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        wh6Var.d(str, "Error querying for table", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = strArr2;
                    wh6Var.d(str, "Error querying for table", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    hashSet = new HashSet();
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                            }
                        }
                        if (strArr != null) {
                            for (i2 = 0; i2 < strArr.length; i2 += 2) {
                                if (!hashSet.remove(strArr[i2])) {
                                    sQLiteDatabase.execSQL(strArr[i2 + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        wh6Var.d(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = strArr2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                strArr2 = null;
            } catch (Throwable th3) {
                th = th3;
                strArr2 = null;
            }
            try {
                hashSet = new HashSet();
                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i < r3) {
                    if (hashSet.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    while (i2 < strArr.length) {
                        if (!hashSet.remove(strArr[i2])) {
                            sQLiteDatabase.execSQL(strArr[i2 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    wh6Var.d(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
                }
            } catch (SQLiteException e4) {
                bi6Var.f.c(str, "Failed to verify columns on table that was just created");
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static void b(bi6 bi6Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        wh6 wh6Var = bi6Var.i;
        if (!readable) {
            wh6Var.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            wh6Var.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            wh6Var.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        wh6Var.b("Failed to turn on database write permission for owner");
    }
}
