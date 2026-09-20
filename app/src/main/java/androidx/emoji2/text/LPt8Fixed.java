package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import defpackage.Q6g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed {
    public static final Object i = new Object();
    public static volatile LPt8Fixed j;
    public final ReentrantReadWriteLock a;
    public final Q6g b;
    public volatile int c;
    public final Handler d;
    public final QnHx e;
    public final auxFixed f;
    public final int g;
    public final androidx.emoji2.text.CQf h;

    public static class CQf {
        public final LPt8Fixed a;

        public CQf(LPt8Fixed lPt8) {
            this.a = lPt8;
        }
    }

    public static abstract class F1 {
        public final auxFixed a;
        public int b = 0;
        public final androidx.emoji2.text.CQf c = new androidx.emoji2.text.CQf();

        public F1(auxFixed auxVar) {
            this.a = auxVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.LPt8$LPt8, reason: collision with other inner class name */
    public interface InterfaceC0023LPt8 {
    }

    public static abstract class NUlFixed {
        public void a() {
        }

        public void b() {
        }
    }

    public static final class QnHx extends CQf {
        public volatile androidx.emoji2.text.YKK b;
        public volatile androidx.emoji2.text.T23 c;

        public QnHx(LPt8Fixed lPt8) {
            super(lPt8);
        }
    }

    public static abstract class T23 {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.T23 t23);
    }

    public static class YKK implements Runnable {
        public final ArrayList w;
        public final int x;

        public YKK(List list, int i, Throwable th) {
            if (list == null) {
                throw new NullPointerException("initCallbacks cannot be null");
            }
            this.w = new ArrayList(list);
            this.x = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i = 0;
            if (this.x != 1) {
                while (i < size) {
                    ((NUlFixed) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((NUlFixed) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    public interface auxFixed {
        void a(T23 t23);
    }

    public static class byN {
    }

    public LPt8Fixed(EmojiCompatInitializer.QnHx qnHx) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        auxFixed auxVar = qnHx.a;
        this.f = auxVar;
        int i2 = qnHx.b;
        this.g = i2;
        this.h = qnHx.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new Q6g();
        QnHx qnHx2 = new QnHx(this);
        this.e = qnHx2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                auxVar.a(new androidx.emoji2.text.F1(qnHx2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static LPt8Fixed a() {
        LPt8Fixed lPt8;
        synchronized (i) {
            lPt8 = j;
            if (!(lPt8 != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return lPt8;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            QnHx qnHx = this.e;
            LPt8Fixed lPt8 = qnHx.a;
            try {
                lPt8.f.a(new androidx.emoji2.text.F1(qnHx));
            } catch (Throwable th) {
                lPt8.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new YKK(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new YKK(arrayList, this.c, null));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:60:0x00c9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.CharSequence f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.LPt8Fixed.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(NUlFixed nUl) {
        if (nUl == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new YKK(Arrays.asList(nUl), this.c, null));
            } else {
                this.b.add(nUl);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
