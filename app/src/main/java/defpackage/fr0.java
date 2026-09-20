package defpackage;

import android.app.Application;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.LPt8Fixed;
import androidx.emoji2.text.NUlFixed;
import androidx.emoji2.text.QnHx;
import androidx.emoji2.text.auxFixed;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fr0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fr0(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.w) {
            case 0:
                EmojiCompatInitializer.CQf cQf = (EmojiCompatInitializer.CQf) this.x;
                LPt8Fixed.T23 t23 = (LPt8Fixed.T23) this.y;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.z;
                cQf.getClass();
                try {
                    auxFixed auxVarA = QnHx.a(cQf.a);
                    if (auxVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    auxFixed.CQf cQf2 = (auxFixed.CQf) auxVarA.a;
                    synchronized (cQf2.d) {
                        cQf2.f = threadPoolExecutor;
                        break;
                    }
                    auxVarA.a.a(new NUlFixed(t23, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    t23.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                GoogleDeviceIdentifiersFetcher.m28getDeviceIdentifiers$lambda0((GoogleDeviceIdentifiersFetcher) this.x, (Application) this.y, (j81) this.z);
                return;
        }
    }
}
