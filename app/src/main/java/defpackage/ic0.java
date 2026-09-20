package defpackage;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ic0 {
    public static final Charset d = Charset.forName("UTF-8");
    public final Context a;
    public final yj2 b;
    public final fx0 c;

    public ic0(Context context, yj2 yj2Var, fx0 fx0Var) {
        this.a = context;
        this.b = yj2Var;
        this.c = fx0Var;
    }

    public static File b(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void f(fx0 fx0Var, String str, String str2, String str3) throws Throwable {
        File file = new File(fx0Var.b(str), str3);
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d));
            try {
                bufferedWriter2.write(str2);
                kw.a(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                kw.a(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                kw.a(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final nf4 a(String str) {
        File fileB = this.c.b(str);
        File file = new File(fileB, "pending");
        String str2 = "Minidump directory: " + file.getAbsolutePath();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        File fileB2 = b(file, ".dmp");
        String strConcat = "Minidump file ".concat((fileB2 == null || !fileB2.exists()) ? "does not exist" : "exists");
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        nf4.QnHx qnHx = new nf4.QnHx();
        if (fileB.exists() && file.exists()) {
            qnHx.a = b(file, ".dmp");
            qnHx.b = b(fileB, ".device_info");
            qnHx.c = new File(fileB, "session.json");
            qnHx.d = new File(fileB, "app.json");
            qnHx.e = new File(fileB, "device.json");
            qnHx.f = new File(fileB, "os.json");
        }
        return new nf4(qnHx);
    }

    public final void c(String str, String str2, long j) throws Throwable {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", str2);
        map.put("started_at_seconds", Long.valueOf(j));
        f(this.c, str, new JSONObject(map).toString(), "session.json");
    }

    public final void d(String str, kt4.QnHx qnHx) throws Throwable {
        String strA = qnHx.a();
        String strE = qnHx.e();
        String strF = qnHx.f();
        String strD = qnHx.d();
        int iB = qnHx.b();
        fk0 fk0VarC = qnHx.c();
        if (fk0VarC.b == null) {
            fk0VarC.b = new fk0.QnHx(fk0VarC);
        }
        String str2 = fk0VarC.b.a;
        fk0 fk0VarC2 = qnHx.c();
        if (fk0VarC2.b == null) {
            fk0VarC2.b = new fk0.QnHx(fk0VarC2);
        }
        String str3 = fk0VarC2.b.b;
        HashMap map = new HashMap();
        map.put("app_identifier", strA);
        map.put("version_code", strE);
        map.put("version_name", strF);
        map.put("install_uuid", strD);
        map.put("delivery_mechanism", Integer.valueOf(iB));
        if (str2 == null) {
            str2 = "";
        }
        map.put("development_platform", str2);
        if (str3 == null) {
            str3 = "";
        }
        map.put("development_platform_version", str3);
        f(this.c, str, new JSONObject(map).toString(), "app.json");
    }

    public final void e(String str, kt4.CQf cQf) throws Throwable {
        int iA = cQf.a();
        String strF = cQf.f();
        int iB = cQf.b();
        long jI = cQf.i();
        long jC = cQf.c();
        boolean zD = cQf.d();
        int iH = cQf.h();
        String strE = cQf.e();
        String strG = cQf.g();
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(iA));
        map.put("build_model", strF);
        map.put("available_processors", Integer.valueOf(iB));
        map.put("total_ram", Long.valueOf(jI));
        map.put("disk_space", Long.valueOf(jC));
        map.put("is_emulator", Boolean.valueOf(zD));
        map.put(AdOperationMetric.INIT_STATE, Integer.valueOf(iH));
        map.put("build_manufacturer", strE);
        map.put("build_product", strG);
        f(this.c, str, new JSONObject(map).toString(), "device.json");
    }

    public final void g(String str, kt4.F1 f1) throws Throwable {
        String strC = f1.c();
        String strB = f1.b();
        boolean zA = f1.a();
        HashMap map = new HashMap();
        map.put(MediationMetaData.KEY_VERSION, strC);
        map.put("build_version", strB);
        map.put("is_rooted", Boolean.valueOf(zA));
        f(this.c, str, new JSONObject(map).toString(), "os.json");
    }
}
