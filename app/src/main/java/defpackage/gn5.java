package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gn5 {
    public static final String a = s52.e("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || !databasePath.exists()) {
            return;
        }
        String str = a;
        s52.c().a(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        HashMap map = new HashMap();
        if (i >= 23) {
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            File databasePath3 = i < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath2, databasePath3);
            for (String str2 : b) {
                map.put(new File(databasePath2.getPath() + str2), new File(databasePath3.getPath() + str2));
            }
        }
        for (File file : map.keySet()) {
            File file2 = (File) map.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    s52.c().f(str, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                s52.c().a(str, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }
}
