package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y45 {

    public interface CQf {
        byte a(int i);

        int size();
    }

    public static class QnHx implements CQf {
        public final /* synthetic */ lk a;

        public QnHx(lk lkVar) {
            this.a = lkVar;
        }

        @Override // y45.CQf
        public final byte a(int i) {
            return this.a.b(i);
        }

        @Override // y45.CQf
        public final int size() {
            return this.a.size();
        }
    }

    public static String a(lk lkVar) {
        return b(new QnHx(lkVar));
    }

    public static String b(CQf cQf) {
        StringBuilder sb = new StringBuilder(cQf.size());
        for (int i = 0; i < cQf.size(); i++) {
            byte bA = cQf.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
