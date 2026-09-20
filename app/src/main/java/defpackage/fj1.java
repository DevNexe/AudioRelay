package defpackage;

import android.content.res.Resources;
import com.azefsw.audioconnect.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 {
    public final HashMap<CQf, WeakReference<QnHx>> a = new HashMap<>();

    public static final class CQf {
        public final Resources.Theme a;
        public final int b = R.drawable.google_play;

        public CQf(Resources.Theme theme) {
            this.a = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && this.b == cQf.b;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.a);
            sb.append(", id=");
            return qc0.a(sb, this.b, ')');
        }
    }

    public static final class QnHx {
        public final ej1 a;
        public final int b;

        public QnHx(ej1 ej1Var, int i) {
            this.a = ej1Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && this.b == qnHx.b;
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.a);
            sb.append(", configFlags=");
            return qc0.a(sb, this.b, ')');
        }
    }
}
