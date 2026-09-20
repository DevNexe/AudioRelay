package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fx0 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public fx0(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        d(file);
        this.b = file;
        File file2 = new File(file, "open-sessions");
        d(file2);
        this.c = file2;
        File file3 = new File(file, "reports");
        d(file3);
        this.d = file3;
        File file4 = new File(file, "priority-reports");
        d(file4);
        this.e = file4;
        File file5 = new File(file, "native-reports");
        d(file5);
        this.f = file5;
    }

    public static void a(File file) {
        if (file.exists() && e(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static synchronized void d(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            file.delete();
        }
        if (!file.mkdirs()) {
            Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
        }
    }

    public static boolean e(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> f(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File b(String str) {
        File file = new File(this.c, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public final File c(String str, String str2) {
        File file = new File(this.c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
