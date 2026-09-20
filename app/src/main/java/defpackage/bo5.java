package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bo5 {
    /* JADX WARN: Code duplicated, block: B:49:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:93), block:B:34:0x005b */
    public static p80 a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        IOException e;
        ObjectInputStream objectInputStream2;
        p80 p80Var = new p80();
        if (bArr == null) {
            return p80Var;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        p80Var.a.add(new p80.QnHx(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } catch (IOException e5) {
                objectInputStream = null;
                e = e5;
            } catch (Throwable th) {
                th = th;
                if (objectInputStream3 != null) {
                    try {
                        objectInputStream3.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return p80Var;
        } catch (Throwable th2) {
            th = th2;
            objectInputStream3 = objectInputStream2;
            if (objectInputStream3 != null) {
                objectInputStream3.close();
            }
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(ex0.b("Could not convert ", i, " to BackoffPolicy"));
    }

    public static co2 c(int i) {
        if (i == 0) {
            return co2.NOT_REQUIRED;
        }
        if (i == 1) {
            return co2.CONNECTED;
        }
        if (i == 2) {
            return co2.UNMETERED;
        }
        if (i == 3) {
            return co2.NOT_ROAMING;
        }
        if (i == 4) {
            return co2.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(ex0.b("Could not convert ", i, " to NetworkType"));
        }
        return co2.TEMPORARILY_UNMETERED;
    }

    public static int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(ex0.b("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static kn5 e(int i) {
        if (i == 0) {
            return kn5.ENQUEUED;
        }
        if (i == 1) {
            return kn5.RUNNING;
        }
        if (i == 2) {
            return kn5.SUCCEEDED;
        }
        if (i == 3) {
            return kn5.FAILED;
        }
        if (i == 4) {
            return kn5.BLOCKED;
        }
        if (i == 5) {
            return kn5.CANCELLED;
        }
        throw new IllegalArgumentException(ex0.b("Could not convert ", i, " to State"));
    }

    public static int f(kn5 kn5Var) {
        int iOrdinal = kn5Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + kn5Var + " to int");
                    }
                }
            }
        }
        return i;
    }
}
