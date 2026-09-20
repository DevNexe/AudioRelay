package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pg {
    public final Context a;
    public final op2 b;
    public final List<QnHx> c = Collections.singletonList(new QnHx(20, 30));
    public final List<QnHx> d = ps0.M(new QnHx(0, 20), new QnHx(10, 10));

    public static final class QnHx {
        public final int a;
        public final int b;

        public QnHx(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OverrideConfig(latencyDiffThresholdMs=");
            sb.append(this.a);
            sb.append(", diffTargetMs=");
            return ex0.c(sb, this.b, ")");
        }
    }

    public pg(Context context, op2 op2Var) {
        this.a = context;
        this.b = op2Var;
    }
}
