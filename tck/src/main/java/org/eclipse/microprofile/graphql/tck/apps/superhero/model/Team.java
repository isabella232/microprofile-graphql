/*
 * Copyright (c) 2019 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.graphql.tck.apps.superhero.model;

import java.util.List;
import java.util.Objects;

public class Team {

    private String name;
    private List<SuperHero> members;

    public Team(){
    
    }
    
    public Team(String name, List<SuperHero> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<SuperHero> getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(List<SuperHero> members) {
        this.members = members;
    }

    public Team addMembers(SuperHero...heroes) {
        for (SuperHero hero : heroes) {
            members.add(hero);
        }
        return this;
    }
    public Team removeMembers(SuperHero...heroes) {
        for (SuperHero hero : heroes) {
            members.remove(hero);
        }
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", members=" + members + '}';
    }
    
    
}
