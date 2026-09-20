package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zt4 {
    public final String a;

    public static final class CQf extends zt4 {
        public CQf() {
            super("audio_focus_request_failed");
        }
    }

    public static final class F1 extends zt4 {
        public F1() {
            super("configuration_change");
        }
    }

    public static final class LPt8Fixed extends zt4 {
        public LPt8Fixed() {
            super("error");
        }
    }

    public static final class NUlFixed extends zt4 {
        public NUlFixed() {
            super("noisy_event");
        }
    }

    public static final class QnHx extends zt4 {
        public QnHx() {
            super("audio_focus_loss");
        }
    }

    public static final class T23 extends zt4 {
        public T23() {
            super("user_requested");
        }
    }

    public static final class YKK extends zt4 {
        public YKK() {
            super("premium_needed_for_multi");
        }
    }

    public static final class auxFixed extends zt4 {
        public auxFixed() {
            super("unknown");
        }
    }

    public static final class byN extends zt4 {
        public byN() {
            super("user_requested_from_server");
        }
    }

    public zt4(String str) {
        this.a = str;
    }
}
