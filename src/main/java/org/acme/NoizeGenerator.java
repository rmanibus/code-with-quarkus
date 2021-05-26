package org.acme;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.scheduler.Scheduled;
import org.jboss.logging.Logger;

@ApplicationScoped
public class NoizeGenerator {

    private static final Logger LOG = Logger.getLogger(NoizeGenerator.class);

    @Scheduled(every="1s")
    void increment() {
        LOG.info("noize");
    }

}
