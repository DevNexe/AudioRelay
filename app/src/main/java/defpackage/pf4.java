package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import android.util.Log;
import com.azefsw.audioconnect.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pf4 implements my6 {
    public final Context w;

    public pf4(Context context, int i) {
        if (i == 1) {
            this.w = context;
            return;
        }
        if (i == 2) {
            this.w = context;
        } else if (i != 3) {
            this.w = context;
        } else {
            this.w = context;
        }
    }

    public final cf5 a(String str) {
        return new cf5(this.w.getString(R.string.billing_generic_error, str));
    }

    @Override // defpackage.my6
    public final Object zza() {
        hy6 hy6Var;
        hy6 iy6Var;
        hy6 iy6Var2;
        Context contextCreateDeviceProtectedStorageContext = this.w;
        Object obj = ay6.f;
        synchronized (hx6.class) {
            hy6Var = hx6.a;
            if (hy6Var == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    UserManager userManager = rw6.a;
                    if ((Build.VERSION.SDK_INT >= 24) && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                        contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                            iy6Var = file.exists() ? new iy6(file) : ey6.w;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            iy6Var = ey6.w;
                        }
                        if (iy6Var.b()) {
                            File file2 = (File) iy6Var.a();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                try {
                                    ok4 ok4Var = new ok4();
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            if (!ok4Var.containsKey(str3)) {
                                                ok4Var.put(str3, new ok4());
                                            }
                                            ((ok4) ok4Var.getOrDefault(str3, null)).put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + contextCreateDeviceProtectedStorageContext.getPackageName());
                                    ax6 ax6Var = new ax6(ok4Var);
                                    bufferedReader.close();
                                    iy6Var2 = new iy6(ax6Var);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            iy6Var2 = ey6.w;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        hy6Var = iy6Var2;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    hy6Var = ey6.w;
                }
                hx6.a = hy6Var;
            }
        }
        return hy6Var;
    }
}
