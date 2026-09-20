package defpackage;

import j$.util.Optional;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n60 implements i60, mf4 {
    public final Set<ka3> a;
    public final cs b;
    public final pq2 c;
    public final xn2 d;
    public final gq4 e;
    public final qx2 f;
    public volatile boolean h;
    public volatile boolean i;
    public volatile CQf j;
    public volatile s50 k;
    public final c2 m;
    public final dw4<QnHx> g = new rg3().G();
    public final w9<Optional<s50>> l = new w9<>();

    public static final class CQf {
        public final Socket a;
        public final DatagramSocket b;

        public CQf(Socket socket, DatagramSocket datagramSocket) {
            this.a = socket;
            this.b = datagramSocket;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && ur1.a(this.b, cQf.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Sockets(tcp=" + this.a + ", udp=" + this.b + ")";
        }
    }

    public /* synthetic */ class F1 extends l91 implements j81<Throwable, sd5> {
        public F1(Object obj) {
            super(1, obj, n60.class, "onTcpError", "onTcpError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            n60 n60Var = (n60) this.x;
            n60Var.getClass();
            n60Var.g.g(new QnHx.CQf(th));
            return sd5.a;
        }
    }

    public /* synthetic */ class LPt8Fixed extends l91 implements j81<Throwable, sd5> {
        public LPt8Fixed(Object obj) {
            super(1, obj, n60.class, "onUdpError", "onUdpError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            Throwable th2 = th;
            n60 n60Var = (n60) this.x;
            n60Var.getClass();
            if (!XTd3.q(th2, nl3.a(SocketTimeoutException.class))) {
                n60Var.g.g(new QnHx.CQf(th2));
            }
            return sd5.a;
        }
    }

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final Throwable a;

            public CQf(Throwable th) {
                this.a = th;
            }
        }

        /* JADX INFO: renamed from: n60$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0172QnHx extends QnHx {
            public static final C0172QnHx a = new C0172QnHx();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n60(Set<? extends ka3> set, cs csVar, pq2 pq2Var, xn2 xn2Var, gq4 gq4Var, qx2 qx2Var) {
        this.a = set;
        this.b = csVar;
        this.c = pq2Var;
        this.d = xn2Var;
        this.e = gq4Var;
        this.f = qx2Var;
        gq0.QnHx qnHx = gq0.x;
        this.m = new c2(ps0.o0(1, kq0.MINUTES));
    }

    @Override // defpackage.i60
    public final zr2 a(e61 e61Var, c54 c54Var) {
        vq2<QnHx> vq2VarX = this.g.x(QnHx.C0172QnHx.a);
        pa3 pa3Var = new pa3() { // from class: k60
            @Override // defpackage.pa3
            public final boolean test(Object obj) {
                return !this.w.h;
            }
        };
        vq2VarX.getClass();
        pr2 pr2Var = new pr2(vq2VarX, pa3Var);
        l60 l60Var = new l60(this, 0);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        int i = 1;
        vq2 vq2VarN = new jr2(pr2Var, l60Var, byn, t23).u(c54Var).n(new C$(this, e61Var, c54Var, i)).n(new NFo7(this, 10));
        nm3 nm3Var = new nm3(2, this, e61Var);
        vq2VarN.getClass();
        return new zr2(new jr2(new jr2(vq2VarN, nm3Var, byn, t23), new dc(this, i), byn, t23));
    }

    @Override // defpackage.i60
    public final w9 b() {
        return this.l;
    }

    public final void c(zt4 zt4Var) throws IOException {
        a62 a62Var = a62.a;
        s50 s50Var = this.k;
        if (s50Var != null) {
            int i = 0;
            s50Var.d = false;
            s50Var.b.b = true;
            s50Var.c.b = true;
            if (zt4Var != null) {
                try {
                    a62Var.k("Sending stop message...");
                    fx fxVar = new fx(new j60(s50Var, this, zt4Var, i));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c54 c54Var = j54.b;
                    if (timeUnit == null) {
                        throw new NullPointerException("unit is null");
                    }
                    if (c54Var == null) {
                        throw new NullPointerException("scheduler is null");
                    }
                    vx vxVar = new vx(new zw(fxVar, timeUnit, c54Var), timeUnit, c54Var);
                    jb jbVar = new jb();
                    vxVar.b(jbVar);
                    if (jbVar.getCount() != 0) {
                        try {
                            jbVar.await();
                        } catch (InterruptedException e) {
                            jbVar.z = true;
                            vl0 vl0Var = jbVar.y;
                            if (vl0Var != null) {
                                vl0Var.a();
                            }
                            throw uu0.d(e);
                        }
                    }
                    Throwable th = jbVar.x;
                    if (th != null) {
                        throw uu0.d(th);
                    }
                } catch (Exception e2) {
                    a62 a62Var2 = a62.a;
                    a62Var2.h("player", "failed_to_send_stop_message", e2.getMessage());
                    a62Var2.b("Failed to send stop message", e2);
                }
            }
            s50Var.d = false;
            m15 m15Var = s50Var.b;
            m15Var.b = true;
            m15Var.c.close();
            hd5 hd5Var = s50Var.c;
            hd5Var.b = true;
            hd5Var.c.close();
        }
        this.k = null;
        CQf cQf = this.j;
        if (cQf != null) {
            cQf.a.close();
            cQf.b.close();
        }
    }

    @Override // defpackage.mf4
    public final synchronized void d(zt4 zt4Var) {
        this.i = true;
        this.g.b();
        this.l.b();
        c(zt4Var);
    }

    @Override // defpackage.mf4
    public final void e() {
    }

    public final s50 f(fc4 fc4Var, bs bsVar) throws Throwable {
        Object qnHx;
        a62 a62Var = a62.a;
        ArrayList arrayList = new ArrayList();
        try {
            Socket socket = new Socket();
            arrayList.add(socket);
            int i = 10000;
            socket.setSoTimeout(10000);
            socket.setTcpNoDelay(true);
            socket.setPerformancePreferences(0, 2, 1);
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            arrayList.add(datagramSocket);
            datagramSocket.setSoTimeout(5000);
            datagramSocket.setReuseAddress(true);
            datagramSocket.bind(new InetSocketAddress(59100));
            CQf cQf = new CQf(socket, datagramSocket);
            this.j = cQf;
            try {
                qnHx = g(fc4Var, bsVar, socket, datagramSocket);
            } catch (Throwable th) {
                qnHx = new fq3.QnHx(th);
            }
            if (!(qnHx instanceof fq3.QnHx)) {
                Socket socket2 = cQf.a;
                String str = ((s50) qnHx).a.a.w;
                if (!v84.a(str, "0.20.0")) {
                    a62.a.l("Old server version, setting the timeout to 0 (" + str + ")");
                    i = 0;
                }
                socket2.setSoTimeout(i);
            }
            if (fq3.a(qnHx) != null) {
                cQf.a.close();
                cQf.b.close();
            }
            this.j = null;
            C0239D.H(qnHx);
            return (s50) qnHx;
        } catch (Throwable th2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Closeable) it.next()).close();
            }
            throw th2;
        }
    }

    public final s50 g(fc4 fc4Var, bs bsVar, Socket socket, DatagramSocket datagramSocket) throws Throwable {
        Object qnHx;
        Object qnHx2;
        try {
            socket.connect(new InetSocketAddress(fc4Var.a, 59100), 5000);
            qnHx = sd5.a;
        } catch (Throwable th) {
            qnHx = new fq3.QnHx(th);
        }
        Throwable thA = fq3.a(qnHx);
        if (thA != null) {
            throw new cc4(thA);
        }
        if (!(qnHx instanceof fq3.QnHx)) {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            try {
                qnHx2 = this.c.h(inputStream, outputStream, bsVar);
            } catch (Throwable th2) {
                qnHx2 = new fq3.QnHx(th2);
            }
            boolean z = !(qnHx2 instanceof fq3.QnHx);
            if (z) {
                a62 a62Var = a62.a;
                yb4 yb4Var = ((h50) qnHx2).a;
                a62Var.j("last_server_version", yb4Var.w);
                a62Var.j("last_server_os", yb4Var.x.w);
                a62Var.j("last_server_os_version", yb4Var.y);
            }
            if (z) {
                h50 h50Var = (h50) qnHx2;
                qnHx2 = new s50(new x50(h50Var.a, h50Var.b, h50Var.c), new m15(socket, inputStream, outputStream, new F1(this)), new hd5(datagramSocket, socket.getInetAddress().getHostAddress(), new LPt8Fixed(this)));
            }
            Throwable thA2 = fq3.a(qnHx2);
            if (thA2 != null) {
                a62.a.a("Error on config exchange: " + thA2.getMessage());
            }
            C0239D.H(qnHx2);
            qnHx = (s50) qnHx2;
        }
        C0239D.H(qnHx);
        return (s50) qnHx;
    }
}
