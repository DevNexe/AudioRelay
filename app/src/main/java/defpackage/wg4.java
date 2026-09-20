package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wg4 implements uw4<Void, Void> {
    public final /* synthetic */ xg4 w;

    public wg4(xg4 xg4Var) {
        this.w = xg4Var;
    }

    @Override // defpackage.uw4
    public final w05<Void> e(Void r12) throws Throwable {
        JSONObject jSONObjectD;
        FileWriter fileWriter;
        xg4 xg4Var = this.w;
        xi5 xi5Var = xg4Var.f;
        sh4 sh4Var = xg4Var.b;
        xi5Var.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap mapC = xi5.c(sh4Var);
            sy4 sy4Var = (sy4) xi5Var.y;
            String str = (String) xi5Var.x;
            sy4Var.getClass();
            mf1 mf1Var = new mf1(str, mapC);
            HashMap map = mf1Var.c;
            map.put("User-Agent", "Crashlytics Android SDK/18.2.13");
            map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            xi5.a(mf1Var, sh4Var);
            ((kK) xi5Var.z).c("Requesting settings from " + ((String) xi5Var.x));
            ((kK) xi5Var.z).h("Settings query params were: " + mapC);
            jSONObjectD = xi5Var.d(mf1Var.b());
        } catch (IOException e) {
            if (((kK) xi5Var.z).b(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            }
            jSONObjectD = null;
        }
        if (jSONObjectD != null) {
            qg4 qg4VarH = xg4Var.c.h(jSONObjectD);
            long j = qg4VarH.c;
            pq2 pq2Var = xg4Var.e;
            pq2Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectD.put("expires_at", j);
                fileWriter = new FileWriter((File) pq2Var.w);
                try {
                    try {
                        fileWriter.write(jSONObjectD.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        kw.a(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e3) {
                e = e3;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                kw.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            kw.a(fileWriter, "Failed to close settings writer.");
            xg4.b("Loaded settings: ", jSONObjectD);
            String str2 = sh4Var.f;
            SharedPreferences.Editor editorEdit = xg4Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str2);
            editorEdit.apply();
            xg4Var.h.set(qg4VarH);
            xg4Var.i.get().c(qg4VarH);
        }
        return k15.e(null);
    }
}
