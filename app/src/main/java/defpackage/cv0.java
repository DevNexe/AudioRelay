package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class cv0 {
    public final jj3 a;
    public final COm6Fixed b;
    public final bj3 c;
    public final fu0 d;
    public ru3.QnHx e;
    public ru3 f;
    public int g;
    public int h;
    public int i;
    public pu3 j;

    public cv0(jj3 jj3Var, COm6Fixed cOm6, bj3 bj3Var, fu0 fu0Var) {
        this.a = jj3Var;
        this.b = cOm6;
        this.c = bj3Var;
        this.d = fu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d A[LOOP:3: B:98:0x0187->B:100:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0239  */
    /* JADX WARN: Code duplicated, block: B:128:0x0250  */
    /* JADX WARN: Code duplicated, block: B:130:0x025c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0233 A[EDGE_INSN: B:212:0x0233->B:123:0x0233 BREAK  A[LOOP:1: B:60:0x00d7->B:214:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0172  */
    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    public final ej3 a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        pu3 pu3Var;
        ru3.QnHx qnHx;
        ru3 ru3Var;
        ArrayList arrayList;
        boolean z3;
        ru3.QnHx qnHx2;
        boolean z4;
        COm6Fixed cOm6;
        Proxy proxy;
        ArrayList arrayList2;
        String hostName;
        int port;
        boolean z5;
        List<InetAddress> listA;
        Iterator<InetAddress> it;
        Iterator<? extends InetSocketAddress> it2;
        pu3 pu3Var2;
        ny1 ny1Var;
        boolean zContains;
        ej3 ej3Var;
        ny1 ny1Var2;
        pu3 pu3Var3;
        Socket socketN;
        while (!this.c.L) {
            ej3 ej3Var2 = this.c.F;
            if (ej3Var2 != null) {
                synchronized (ej3Var2) {
                    if (!ej3Var2.j) {
                        ch1 ch1Var = ej3Var2.b.a.i;
                        ch1 ch1Var2 = this.b.i;
                        socketN = !(ch1Var.e == ch1Var2.e && ur1.a(ch1Var.d, ch1Var2.d)) ? this.c.n() : null;
                    }
                    sd5 sd5Var = sd5.a;
                }
                if (this.c.F != null) {
                    if (!(socketN == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketN != null) {
                        qf5.e(socketN);
                    }
                    this.d.getClass();
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        ej3Var2 = this.c.F;
                        this.d.getClass();
                    } else {
                        pu3Var = this.j;
                        try {
                            if (pu3Var != null) {
                                this.j = null;
                            } else {
                                qnHx = this.e;
                                if (qnHx == null && qnHx.a()) {
                                    ru3.QnHx qnHx3 = this.e;
                                    if (!qnHx3.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i5 = qnHx3.b;
                                    qnHx3.b = i5 + 1;
                                    pu3Var = qnHx3.a.get(i5);
                                } else {
                                    ru3Var = this.f;
                                    if (ru3Var == null) {
                                        COm6Fixed cOm7 = this.b;
                                        bj3 bj3Var = this.c;
                                        ru3Var = new ru3(cOm7, bj3Var.w.Y, bj3Var, this.d);
                                        this.f = ru3Var;
                                    }
                                    if (ru3Var.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    do {
                                        if (ru3Var.e < ru3Var.d.size()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            break;
                                        }
                                        if (ru3Var.e < ru3Var.d.size()) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        cOm6 = ru3Var.a;
                                        if (z4) {
                                            throw new SocketException("No route to " + cOm6.i.d + "; exhausted proxy configurations: " + ru3Var.d);
                                        }
                                        List<? extends Proxy> list = ru3Var.d;
                                        int i6 = ru3Var.e;
                                        ru3Var.e = i6 + 1;
                                        proxy = list.get(i6);
                                        arrayList2 = new ArrayList();
                                        ru3Var.f = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            ch1 ch1Var3 = cOm6.i;
                                            hostName = ch1Var3.d;
                                            port = ch1Var3.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(ur1.d(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            ru3Var.c.getClass();
                                            listA = cOm6.a.a(hostName);
                                            if (!listA.isEmpty()) {
                                                throw new UnknownHostException(cOm6.a + " returned no addresses for " + hostName);
                                            }
                                            it = listA.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        it2 = ru3Var.f.iterator();
                                        while (it2.hasNext()) {
                                            pu3Var2 = new pu3(ru3Var.a, proxy, it2.next());
                                            ny1Var = ru3Var.b;
                                            synchronized (ny1Var) {
                                                zContains = ((Set) ny1Var.w).contains(pu3Var2);
                                            }
                                            if (zContains) {
                                                ru3Var.g.add(pu3Var2);
                                            } else {
                                                arrayList.add(pu3Var2);
                                            }
                                        }
                                    } while (!(!arrayList.isEmpty()));
                                    if (arrayList.isEmpty()) {
                                        su.x0(ru3Var.g, arrayList);
                                        ru3Var.g.clear();
                                    }
                                    qnHx2 = new ru3.QnHx(arrayList);
                                    this.e = qnHx2;
                                    if (!this.c.L) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        ej3Var2 = this.c.F;
                                        this.d.getClass();
                                    } else {
                                        if (qnHx2.a()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i7 = qnHx2.b;
                                        qnHx2.b = i7 + 1;
                                        pu3Var = (pu3) arrayList.get(i7);
                                        ej3Var = new ej3(pu3Var);
                                        this.c.N = ej3Var;
                                        ej3Var.c(i, i2, i3, i4, z, this.c, this.d);
                                        this.c.N = null;
                                        ny1Var2 = this.c.w.Y;
                                        pu3Var3 = ej3Var.b;
                                        synchronized (ny1Var2) {
                                            ((Set) ny1Var2.w).remove(pu3Var3);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            ej3 ej3Var3 = this.c.F;
                                            this.j = pu3Var;
                                            qf5.e(ej3Var.d);
                                            this.d.getClass();
                                            ej3Var2 = ej3Var3;
                                        } else {
                                            synchronized (ej3Var) {
                                                jj3 jj3Var = this.a;
                                                jj3Var.getClass();
                                                byte[] bArr = qf5.a;
                                                jj3Var.e.add(ej3Var);
                                                jj3Var.c.c(jj3Var.d, 0L);
                                                this.c.c(ej3Var);
                                                sd5 sd5Var2 = sd5.a;
                                            }
                                            this.d.getClass();
                                            ej3Var2 = ej3Var;
                                        }
                                    }
                                }
                            }
                            ej3Var.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.N = null;
                            ny1Var2 = this.c.w.Y;
                            pu3Var3 = ej3Var.b;
                            synchronized (ny1Var2) {
                                ((Set) ny1Var2.w).remove(pu3Var3);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    ej3 ej3Var4 = this.c.F;
                                    this.j = pu3Var;
                                    qf5.e(ej3Var.d);
                                    this.d.getClass();
                                    ej3Var2 = ej3Var4;
                                } else {
                                    synchronized (ej3Var) {
                                        jj3 jj3Var2 = this.a;
                                        jj3Var2.getClass();
                                        byte[] bArr2 = qf5.a;
                                        jj3Var2.e.add(ej3Var);
                                        jj3Var2.c.c(jj3Var2.d, 0L);
                                        this.c.c(ej3Var);
                                        sd5 sd5Var3 = sd5.a;
                                        this.d.getClass();
                                        ej3Var2 = ej3Var;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.c.N = null;
                            throw th;
                        }
                        arrayList = null;
                        ej3Var = new ej3(pu3Var);
                        this.c.N = ej3Var;
                    }
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    ej3Var2 = this.c.F;
                    this.d.getClass();
                } else {
                    pu3Var = this.j;
                    if (pu3Var != null) {
                        this.j = null;
                    } else {
                        qnHx = this.e;
                        if (qnHx == null) {
                        }
                        ru3Var = this.f;
                        if (ru3Var == null) {
                            COm6Fixed cOm8 = this.b;
                            bj3 bj3Var2 = this.c;
                            ru3Var = new ru3(cOm8, bj3Var2.w.Y, bj3Var2, this.d);
                            this.f = ru3Var;
                        }
                        if (ru3Var.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        do {
                            if (ru3Var.e < ru3Var.d.size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                break;
                                break;
                            }
                            if (ru3Var.e < ru3Var.d.size()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            cOm6 = ru3Var.a;
                            if (z4) {
                                throw new SocketException("No route to " + cOm6.i.d + "; exhausted proxy configurations: " + ru3Var.d);
                            }
                            List<? extends Proxy> list2 = ru3Var.d;
                            int i8 = ru3Var.e;
                            ru3Var.e = i8 + 1;
                            proxy = list2.get(i8);
                            arrayList2 = new ArrayList();
                            ru3Var.f = arrayList2;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                ch1 ch1Var4 = cOm6.i;
                                hostName = ch1Var4.d;
                                port = ch1Var4.e;
                            } else {
                                ch1 ch1Var5 = cOm6.i;
                                hostName = ch1Var5.d;
                                port = ch1Var5.e;
                            }
                            if (1 <= port) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                            } else {
                                ru3Var.c.getClass();
                                listA = cOm6.a.a(hostName);
                                if (!listA.isEmpty()) {
                                    throw new UnknownHostException(cOm6.a + " returned no addresses for " + hostName);
                                }
                                it = listA.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new InetSocketAddress(it.next(), port));
                                }
                            }
                            it2 = ru3Var.f.iterator();
                            while (it2.hasNext()) {
                                pu3Var2 = new pu3(ru3Var.a, proxy, it2.next());
                                ny1Var = ru3Var.b;
                                synchronized (ny1Var) {
                                    zContains = ((Set) ny1Var.w).contains(pu3Var2);
                                    if (zContains) {
                                        ru3Var.g.add(pu3Var2);
                                    } else {
                                        arrayList.add(pu3Var2);
                                    }
                                }
                            }
                        } while (!(!arrayList.isEmpty()));
                        if (arrayList.isEmpty()) {
                            su.x0(ru3Var.g, arrayList);
                            ru3Var.g.clear();
                        }
                        qnHx2 = new ru3.QnHx(arrayList);
                        this.e = qnHx2;
                        if (!this.c.L) {
                            throw new IOException("Canceled");
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            ej3Var2 = this.c.F;
                            this.d.getClass();
                        } else {
                            if (qnHx2.a()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = qnHx2.b;
                            qnHx2.b = i9 + 1;
                            pu3Var = (pu3) arrayList.get(i9);
                            ej3Var = new ej3(pu3Var);
                            this.c.N = ej3Var;
                            ej3Var.c(i, i2, i3, i4, z, this.c, this.d);
                            this.c.N = null;
                            ny1Var2 = this.c.w.Y;
                            pu3Var3 = ej3Var.b;
                            synchronized (ny1Var2) {
                                ((Set) ny1Var2.w).remove(pu3Var3);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    ej3 ej3Var5 = this.c.F;
                                    this.j = pu3Var;
                                    qf5.e(ej3Var.d);
                                    this.d.getClass();
                                    ej3Var2 = ej3Var5;
                                } else {
                                    synchronized (ej3Var) {
                                        jj3 jj3Var3 = this.a;
                                        jj3Var3.getClass();
                                        byte[] bArr3 = qf5.a;
                                        jj3Var3.e.add(ej3Var);
                                        jj3Var3.c.c(jj3Var3.d, 0L);
                                        this.c.c(ej3Var);
                                        sd5 sd5Var4 = sd5.a;
                                        this.d.getClass();
                                        ej3Var2 = ej3Var;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    ej3Var = new ej3(pu3Var);
                    this.c.N = ej3Var;
                    ej3Var.c(i, i2, i3, i4, z, this.c, this.d);
                    this.c.N = null;
                    ny1Var2 = this.c.w.Y;
                    pu3Var3 = ej3Var.b;
                    synchronized (ny1Var2) {
                        ((Set) ny1Var2.w).remove(pu3Var3);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            ej3 ej3Var6 = this.c.F;
                            this.j = pu3Var;
                            qf5.e(ej3Var.d);
                            this.d.getClass();
                            ej3Var2 = ej3Var6;
                        } else {
                            synchronized (ej3Var) {
                                jj3 jj3Var4 = this.a;
                                jj3Var4.getClass();
                                byte[] bArr4 = qf5.a;
                                jj3Var4.e.add(ej3Var);
                                jj3Var4.c.c(jj3Var4.d, 0L);
                                this.c.c(ej3Var);
                                sd5 sd5Var5 = sd5.a;
                                this.d.getClass();
                                ej3Var2 = ej3Var;
                            }
                        }
                    }
                }
            }
            if (ej3Var2.i(z2)) {
                return ej3Var2;
            }
            ej3Var2.k();
            if (this.j == null) {
                ru3.QnHx qnHx4 = this.e;
                if (qnHx4 == null ? true : qnHx4.a()) {
                    continue;
                } else {
                    ru3 ru3Var2 = this.f;
                    if (!(ru3Var2 != null ? ru3Var2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final void b(IOException iOException) {
        this.j = null;
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).w == rt0.REFUSED_STREAM) {
                this.g++;
                return;
            }
        }
        if (iOException instanceof ConnectionShutdownException) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
