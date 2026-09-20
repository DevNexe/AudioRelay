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
public final class lk4 implements mh1 {
    public static ny1 a;

    public class QnHx implements Runnable {
        public final SignalsHandler w;

        public QnHx(SignalsHandler signalsHandler) {
            this.w = signalsHandler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashMap map = new HashMap();
            Iterator it = ((Map) lk4.a.w).entrySet().iterator();
            String str = null;
            while (it.hasNext()) {
                hh3 hh3Var = (hh3) ((Map.Entry) it.next()).getValue();
                String str2 = hh3Var.a;
                QueryInfo queryInfo = hh3Var.b;
                map.put(str2, queryInfo != null ? queryInfo.getQuery() : null);
                String str3 = hh3Var.c;
                if (str3 != null) {
                    str = str3;
                }
            }
            int size = map.size();
            SignalsHandler signalsHandler = this.w;
            if (size > 0) {
                signalsHandler.onSignalsCollected(new JSONObject(map).toString());
            } else if (str == null) {
                signalsHandler.onSignalsCollected("");
            } else {
                signalsHandler.onSignalsCollectionFailed(str);
            }
        }
    }

    public lk4(ny1 ny1Var) {
        a = ny1Var;
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
        hh3 hh3Var = new hh3(str);
        eh3 eh3Var = new eh3(hh3Var, tp1Var);
        ((Map) a.w).put(str, hh3Var);
        QueryInfo.generate(context, adFormat, adRequestBuild, eh3Var);
    }
}
