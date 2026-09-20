package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class fk0 {
    public final Context a;
    public QnHx b = null;

    public class QnHx {
        public final String a;
        public final String b;

        public QnHx(fk0 fk0Var) {
            boolean z;
            int iF = kw.f(fk0Var.a, "com.google.firebase.crashlytics.unity_version", "string");
            Context context = fk0Var.a;
            if (iF != 0) {
                this.a = "Unity";
                String string = context.getResources().getString(iF);
                this.b = string;
                String strA = b70.a("Unity Editor version is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strA, null);
                    return;
                }
                return;
            }
            if (context.getAssets() == null) {
                z = false;
            } else {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    z = true;
                } catch (IOException unused) {
                    z = false;
                }
            }
            if (!z) {
                this.a = null;
                this.b = null;
                return;
            }
            this.a = "Flutter";
            this.b = null;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
            }
        }
    }

    public fk0(Context context) {
        this.a = context;
    }
}
