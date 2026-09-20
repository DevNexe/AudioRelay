package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mk4 implements mh1 {
    public static Map<String, String> a;
    public static fe2 b;

    public class QnHx implements Runnable {
        public final SignalsHandler w;

        public QnHx(SignalsHandler signalsHandler) {
            this.w = signalsHandler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mk4.a = new HashMap();
            Iterator it = mk4.b.a.entrySet().iterator();
            String str = null;
            while (it.hasNext()) {
                ih3 ih3Var = (ih3) ((Map.Entry) it.next()).getValue();
                Map<String, String> map = mk4.a;
                String str2 = ih3Var.a;
                QueryInfo queryInfo = ih3Var.b;
                map.put(str2, queryInfo != null ? queryInfo.getQuery() : null);
                String str3 = ih3Var.c;
                if (str3 != null) {
                    str = str3;
                }
            }
            int size = mk4.a.size();
            SignalsHandler signalsHandler = this.w;
            if (size > 0) {
                signalsHandler.onSignalsCollected(new JSONObject(mk4.a).toString());
            } else if (str == null) {
                signalsHandler.onSignalsCollected("");
            } else {
                signalsHandler.onSignalsCollectionFailed(str);
            }
        }
    }

    public mk4(fe2 fe2Var) {
        b = fe2Var;
    }

    @Override // defpackage.mh1
    public final void a(Context context, String[] strArr, String[] strArr2, SignalsHandler signalsHandler) {
        tp1 tp1Var = new tp1(6);
        for (String str : strArr) {
            tp1Var.b();
            b(context, str, AdFormat.INTERSTITIAL, tp1Var);
        }
        for (String str2 : strArr2) {
            tp1Var.b();
            b(context, str2, AdFormat.REWARDED, tp1Var);
        }
        QnHx qnHx = new QnHx(signalsHandler);
        tp1Var.b = qnHx;
        if (tp1Var.a <= 0) {
            qnHx.run();
        }
    }

    public final void b(Context context, String str, AdFormat adFormat, tp1 tp1Var) {
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        ih3 ih3Var = new ih3(str);
        fh3 fh3Var = new fh3(ih3Var, tp1Var);
        b.a.put(str, ih3Var);
        QueryInfo.generate(context, adFormat, adRequestBuild, fh3Var);
    }
}
