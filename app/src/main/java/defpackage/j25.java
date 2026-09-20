package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j25 {
    public float c;
    public WeakReference<CQf> e;
    public s15 f;
    public final TextPaint a = new TextPaint(1);
    public final QnHx b = new QnHx();
    public boolean d = true;

    public interface CQf {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public class QnHx extends B8C {
        public QnHx() {
        }

        @Override // defpackage.B8C
        public final void J0(int i) {
            j25 j25Var = j25.this;
            j25Var.d = true;
            CQf cQf = j25Var.e.get();
            if (cQf != null) {
                cQf.a();
            }
        }

        @Override // defpackage.B8C
        public final void K0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            j25 j25Var = j25.this;
            j25Var.d = true;
            CQf cQf = j25Var.e.get();
            if (cQf != null) {
                cQf.a();
            }
        }
    }

    public j25(CQf cQf) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(cQf);
    }
}
