package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ylWC implements qp2 {
    public final Context a;

    public static final class QnHx {
        public final String a;
        public final String b;

        public QnHx(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && ur1.a(this.b, qnHx.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NoticeTranslation(title=" + this.a + ", description=" + this.b + ")";
        }
    }

    public ylWC(Context context) {
        this.a = context;
    }

    @Override // defpackage.qp2
    public final mp2 a(mp2 mp2Var) {
        Context context = this.a;
        QnHx qnHx = (QnHx) Collections.singletonMap("NO_AUDIO_DEVICE", new QnHx(context.getString(R.string.running_notice_no_audio_title), context.getString(R.string.running_notice_no_audio_description))).get(mp2Var.a);
        if (qnHx == null) {
            return mp2Var;
        }
        return new mp2(mp2Var.a, qnHx.a, qnHx.b, mp2Var.d, mp2Var.e);
    }
}
