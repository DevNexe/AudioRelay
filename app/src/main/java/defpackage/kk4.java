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
public final class kk4 implements mh1 {
    public static ta2 a;

    public class QnHx implements Runnable {
        public final SignalsHandler w;

        public QnHx(SignalsHandler signalsHandler) {
            this.w = signalsHandler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HashMap map = new HashMap();
            Iterator it = ((Map) kk4.a.x).entrySet().iterator();
            String str = null;
            while (it.hasNext()) {
                jh3 jh3Var = (jh3) ((Map.Entry) it.next()).getValue();
                String str2 = jh3Var.a;
                QueryInfo queryInfo = jh3Var.b;
                map.put(str2, queryInfo != null ? queryInfo.getQuery() : null);
                String str3 = jh3Var.c;
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

    public kk4(ta2 ta2Var) {
        a = ta2Var;
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
        jh3 jh3Var = new jh3(str);
        gh3 gh3Var = new gh3(jh3Var, tp1Var);
        ((Map) a.x).put(str, jh3Var);
        QueryInfo.generate(context, adFormat, adRequestBuild, gh3Var);
    }
}
