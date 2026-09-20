package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class p65 {

    public static final class CQf extends p65 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends p65 {
        public final List<r65> a;

        public F1(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && ur1.a(this.a, ((F1) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ThemeSelectionLoaded(themes=" + this.a + ")";
        }
    }

    public static final class QnHx extends p65 {
        public final r65 a;

        public QnHx(r65 r65Var) {
            this.a = r65Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeTheme(theme=" + this.a + ")";
        }
    }
}
